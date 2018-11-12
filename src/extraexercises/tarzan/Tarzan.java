package extraexercises.tarzan;

public class Tarzan {
    public static void main(String[] args) {
        // 30 cannibals begin to eat 10 missionaries

        // first missionarie takes 1 hour

        // each hour a cannibal leaves

        // tarzan is 80 miles aay

        // tarzan speed = 7 miles / hour

        // tarzan speed = 4 miles / hour in darkness

        // darkness = 9 hours

        // now ther's 3 hours left till darkness

        /*
        END OF HOUR     MISSIONARIES LEFT               CANNIBALS EATING        TARZAN  DISTANCE        CURR MISS BEING EATEN
        -----------     ----------------------------    -------------------------------------   ----------------------------------------------
                0               10                              30                      80                      10
                1               9                               29                      73                      9
                2               8                               28                      66                      8
         */

        int hours = 0;
        float misLeft = 10F;
        int cannibalsLeft = 30;
        int tarzanDist = 80;
        int missBeingEaten = 10;
        float eatingSpeed = 0;
        while((tarzanDist >= 0) && (misLeft >= 0)){
            System.out.print("end of hour: " + hours);
            System.out.print("\t\t");
            //miss that are eaten per hour depends on number of cannbials / 30
            System.out.print("missionaries left: " + misLeft);
            //misLeft -= cannibalsLeft-- / 30;
            System.out.print("\t\t\t\t\t\t");
            System.out.print("cannibals eating: " + cannibalsLeft);
            System.out.print("\t\t\t\t\t");
            //tarzan distance depends on hour
            System.out.print("tarzan distance: ");
            System.out.print(((hours >= 3) && (hours <= 12)) ? "DARK" : "LIGHT");
            System.out.print("\t\t");
            System.out.print(tarzanDist);

            System.out.print("\t\t\t\t\t\t\t");
            System.out.print("curr miss being eaten: " + missBeingEaten--);

            hours++;

            eatingSpeed =  cannibalsLeft / 30F;
            misLeft = (misLeft - eatingSpeed);

            cannibalsLeft--;

            // 9 hours of darkness
            // in 3 hours its darkness
            // between 3 and 12 its dark // now its 0
            tarzanDist -= ((hours > 3) && (hours <= 12)) ? 4 : 7;

            System.out.println();
        }

    }
}



/*
Ik kreeg dit vraagstuk doorgespeeld als extra oefening op wat we tot nog toe gezien hebben. Vond het een leuke herhaling. Het volgende is gegeven:

Thirty cannibals begin to eat ten missionaries. It takes an hour to consume the first missionary. After each HOUR, one cannibal steals away into the forest. Each cannibal eats at a constant rate. Therefore, since there are fewer consumers (cannibals), fewer missionaries will be consumed in each hour.
Fortunately for the missionaries, help is on the way. Tarzan is coming! However, he is 80 miles away. During the day Tarzan travels at seven miles per hour. During the darkness he reduces his speed to 4 miles per hour. Darkness lasts nine hours. When the cannibals start eating, there are only three hours of light left.

Your Task
Write a program to calculate and display how many cannibals will be caught and how many missionaries saved (if any!!). Display your results in the following form:

END OF HOUR     MISSIONARIES LEFT       CANNIBALS EATING        TARZAN  DISTANCE        CURR MISS
BEING EATEN
-----------     ----------------------------    -------------------------------------   --------------------    --------------------------
0       10      30      80      10
1       9       29      73      9
2       8       28      66      8
.       .       .       .       .
.       .       .       .       .
 */