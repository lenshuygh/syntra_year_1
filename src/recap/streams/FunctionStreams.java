package recap.streams;

import p309opdracht3.Geslacht;

import java.util.Comparator;
import java.util.stream.Stream;

public class FunctionStreams {
    public static void main(String[] args) {
        // convert all to upprcase and reversed
        String[] words = {"Thor", "Smiegel", "Kiska", "Snickers", "Elsa", "Lyra", "Mina"};

        String[] upperCaseWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            upperCaseWords[i] = new StringBuilder(words[i].toUpperCase()).reverse().toString();
        }

        for (String upperCaseWord : upperCaseWords) {
            System.out.println(upperCaseWord);
        }

        System.out.println("--------------------streams--------------------");
        String[] toUpperCaseRevertedWords = Stream.of(words)
                .map(String::toUpperCase)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                //.map(word -> new StringBuilder(word).reverse().toString())
                //.map(TextUtil::reverse)
                .toArray(String[]::new);

        for (String toUpperCaseRevertedWord : toUpperCaseRevertedWords) {
            System.out.println(toUpperCaseRevertedWord);
        }

        System.out.println("----------sorted---------------------");
        toUpperCaseRevertedWords = Stream.of(words)
                .map(String::toUpperCase)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .sorted()
                .toArray(String[]::new);

        for (String toUpperCaseRevertedWord : toUpperCaseRevertedWords) {
            System.out.println(toUpperCaseRevertedWord);
        }

        System.out.println("----------sorted inverse---------------------");
        toUpperCaseRevertedWords = Stream.of(words)
                .map(String::toUpperCase)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return -o1.compareTo(o2);
                    }
                })
                .toArray(String[]::new);

        for (String toUpperCaseRevertedWord : toUpperCaseRevertedWords) {
            System.out.println(toUpperCaseRevertedWord);
        }

        System.out.println("----------sorted inverse---------------------");
        toUpperCaseRevertedWords = Stream.of(words)
                .map(String::toUpperCase)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .toArray(String[]::new);

        for (String toUpperCaseRevertedWord : toUpperCaseRevertedWords) {
            System.out.println(toUpperCaseRevertedWord);
        }

        System.out.println("----------sorted inverse---------------------");
        toUpperCaseRevertedWords = Stream.of(words)
                .map(String::toUpperCase)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);

        for (String toUpperCaseRevertedWord : toUpperCaseRevertedWords) {
            System.out.println(toUpperCaseRevertedWord);
        }

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getVoornaam().compareTo(o2.getVoornaam());
                    }
                })
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return -o1.getVoornaam().compareTo(o2.getVoornaam());
                    }
                })
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted((o1, o2) -> -o1.getVoornaam().compareTo(o2.getVoornaam()))
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        if (o1.getGeslacht().equals(o2.getGeslacht())) {
                            return 0;
                        }
                        if (Geslacht.MAN.equals(o1.getGeslacht())) {
                            return 1;
                        }
                        return -1;

                    }
                })
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        if (o1.getGeslacht().equals(o2.getGeslacht())) {
                            return 0;
                        }
                        if (Geslacht.MAN.equals(o1.getGeslacht())) {
                            return 1;
                        }
                        return -1;

                    }
                })
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted((o1, o2) -> {
                    if (o1.getGeslacht().equals(o2.getGeslacht())) {
                        return 0;
                    }
                    if (Geslacht.MAN.equals(o1.getGeslacht())) {
                        return 1;
                    }
                    return -1;

                })
                .forEach(System.out::println);

        System.out.println("-----------------------");
        Stream.of(new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175), new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50))
                .sorted(FunctionStreams::compareGeslacht)
                .forEach(System.out::println);
    }

    private static int compareGeslacht(Person o1, Person o2) {
        if (o1.getGeslacht().equals(o2.getGeslacht())) {
            return 0;
        }
        if (Geslacht.MAN.equals(o1.getGeslacht())) {
            return 1;
        }
        return -1;
    }
}
