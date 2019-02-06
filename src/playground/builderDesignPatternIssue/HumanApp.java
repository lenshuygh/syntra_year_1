package playground.builderDesignPatternIssue;

public class HumanApp {
    public static void main(String[] args) {
        Human.Builder humanBuilder = new Human.Builder("Jefke","Vermeulen");
        Human human = humanBuilder.build();
        System.out.println(human);

        Human human2 = new Human.Builder("Lens","Huygh").age(38).hairColor(Human.HairColor.BROWN).sex(Human.Sex.MALE).alive(true).build();

        System.out.println(human2);
    }
}
