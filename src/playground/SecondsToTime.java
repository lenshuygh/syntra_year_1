package playground;

import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number in seconds: ");
        int sec = scanner.nextInt();
        System.out.println(sec + " seconds -> " + calculateTime(sec));
    }

    private static String calculateTime(int sec) {

        if(sec > 60){
            int seconds = sec % 60;
            int minutes = sec / 60;
            if(minutes > 60){
                int hours = minutes / 60;
                minutes = minutes % 60;
                if(hours > 24){
                    int days = hours / 24;
                    hours = hours % 24;
                    if(days > 365){
                        int years = days / 365;
                        days = days % 365;
                        return years+" years," + days+"days, "+hours+"h"+minutes+"m"+seconds+"s";
                    }else{
                        return days+"days, "+hours+"h"+minutes+"m"+seconds+"s";
                    }
                }else{
                    return hours+"h"+minutes+"m"+seconds+"s";
                }
            }else{
                return minutes+"m"+seconds+"s";
            }
        }else{
            return sec +"s";
        }
    }
}
