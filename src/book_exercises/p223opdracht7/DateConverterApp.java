package book_exercises.p223opdracht7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (DD/MM/YYYY): ");
        String dateString = scanner.nextLine();

        DateTimeFormatter dateTimeFormatterIn = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateString,dateTimeFormatterIn);

        System.out.format("%1$tY-%1$tm-%1$td%n", localDate);

        DateTimeFormatter dateTimeFormatterOut = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateTimeFormatterOut.format(localDate));
    }
}
