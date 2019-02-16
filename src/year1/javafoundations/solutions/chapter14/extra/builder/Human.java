package year1.javafoundations.solutions.chapter14.extra.builder;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private Sex sex;
    private HairColor hairColor;
    private boolean alive;

    private Human (){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hairColor=" + hairColor +
                ", alive=" + alive +
                '}';
    }

    public enum Sex {
        MALE, FEMALE
    }

    public enum HairColor {
        BLUE, YELLOW, ORANGE
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private Sex sex;
        private HairColor hairColor;
        private boolean alive;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder alive(boolean alive){
            this.alive = alive;
            return this;
        }

        public Builder sex(Sex sex){
            this.sex = sex;
            return this;
        }

        public Builder hairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Human build(){
            Human human = new Human();
            human.setFirstName(firstName);
            human.setLastName(lastName);
            human.setAge(age);
            human.setAlive(alive);
            human.setSex(sex);
            human.setHairColor(hairColor);

            return human;
        }
    }
}
