package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class FlourPacker {
    public static void main(String[] args) {
        System.out.println("canPack(1,0,4)");
        System.out.println(canPack(1,0,4));

        System.out.println("canPack(1,0,5)");
        System.out.println(canPack(1,0,5));

        System.out.println("canPack(0,5,4)");
        System.out.println(canPack(0,5,4));

        System.out.println("canPack(2,2,12)");
        System.out.println(canPack(2,2,12));

        System.out.println("canPack(-3,2,12)");
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0){
            return false;
        }

        int bigCountWeight = 5;
        int smallCountWeight = 1;
        int totalWeight = 0;

        for(int i = 0; i < bigCount; i++){
            if(totalWeight + bigCountWeight <= goal){
                totalWeight += bigCountWeight;
            } else {
                break;
            }
        }

        for(int i = 0; i < smallCount; i++){
            if(totalWeight + smallCountWeight <= goal){
                totalWeight += smallCountWeight;
            } else {
                break;
            }
        }

        return totalWeight == goal;
    }
}
