package year1.javafoundations.solutions.chapter14.extra.builder;

public class HumanFactory {
    public static void main(String[] args) {
        Human.Builder humanBuilder = new Human.Builder("Jefke", "Vermeulen");
        humanBuilder.age(8);
        Human human = humanBuilder.build();
        System.out.println(human);

        Human human2 = new Human.Builder("Jefke", "Vermeulen")
                            .alive(true)
                            .age(8)
                            .sex(Human.Sex.MALE)
                            .hairColor(Human.HairColor.BLUE)
                            .build();

        System.out.println(human2);
    }
}
