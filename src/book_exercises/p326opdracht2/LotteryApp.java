package book_exercises.p326opdracht2;

import java.util.*;

public class LotteryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> enteredLotteryNumbers = new HashSet<>();
        Collection<Integer> randomLotteryNumbers = new HashSet<>();
        Random random = new Random();

        do {
            System.out.print("Enter a number (1-45): ");
            String textInput = scanner.nextLine();
            try {
                int input = Integer.parseInt(textInput);
                if (input > 1 && input < 45) {
                    enteredLotteryNumbers.add(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR -> only enter int values please");
            }
        } while (enteredLotteryNumbers.size() < 6);
        scanner.close();

        /*do {
            randomLotteryNumbers.add(random.nextInt(45) + 1);
        } while (randomLotteryNumbers.size() < 6);*/

        new Random()
                .ints(1,45)
                .distinct().limit(6)
                .forEach(randomLotteryNumbers::add);

        enteredLotteryNumbers.retainAll(randomLotteryNumbers);
        System.out.print("Correct Numbers: ");
        enteredLotteryNumbers.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.print("Drawed Numbers: ");
        randomLotteryNumbers.stream().forEach(s -> System.out.print(s + " "));

    }
}
