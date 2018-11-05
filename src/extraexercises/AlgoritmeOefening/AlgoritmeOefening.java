package extraexercises.AlgoritmeOefening;

public class AlgoritmeOefening {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));
        System.out.println();
        System.out.println(canPack(2,0,9));
        System.out.println(canPack(1,5,9));
        System.out.println(canPack(7,5,9));

    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {
        /*
        //any param negative -> false
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }else{
            //check if big bags times bigCount <= goal
            // &
            //check if the sum of all bags is at least the goal weight
            //return (((bigCount * 5) <=  goal) && (((bigCount * 5) + smallCount) >= goal));
            return ((((bigCount * 5) + smallCount) >= goal) &&(goal - smallCount) % 5 == 0);
        }
        */

        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }else{
            //  loop bigCount
            // start filling 5  kg bags until the modulo is not 0 or the goal is reached
            //  loop rest
            // until goal reached or smallCount is reached
            for (int i = 0; i <= goal; i++) {
                if((i / 5 >= 1) && (bigCount > 0)){

                }
            }


        }


    }
}
