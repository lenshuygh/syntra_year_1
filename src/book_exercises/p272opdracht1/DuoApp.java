package book_exercises.p272opdracht1;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> duo = new Duo<>("Thor","Smiegel");
        System.out.println("first: " + duo.getFirst());
        System.out.println("second: " + duo.getSecond());
        duo.swap();
        System.out.println("first: " + duo.getFirst());
        System.out.println("second: " + duo.getSecond());

        Duo<Integer> duo2 = new Duo<>(100,50);
        System.out.println("first: " + duo2.getFirst());
        System.out.println("second: " + duo2.getSecond());
        duo2.swap();
        System.out.println("first: " + duo2.getFirst());
        System.out.println("second: " + duo2.getSecond());
    }
}
