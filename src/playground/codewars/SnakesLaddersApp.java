package playground.codewars;

public class SnakesLaddersApp {
    public static void main(String[] args) {
        SnakesLadders game = new SnakesLadders();
        System.out.println(game.play(1, 1));
        System.out.println(game.play(1, 5));
    }
}
