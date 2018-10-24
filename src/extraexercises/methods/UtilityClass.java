package extraexercises.methods;

import java.util.Random;

public class UtilityClass {
    public static boolean isPositive(float number) {
        /*
        if(number > 0){
            return true;
        }else{
            return false;
        }
        */
        return (number > 0);
    }

    public static boolean isZero(float number) {
        return number == 0;
    }

    public static float max(float number1, float number2){
        return (number1 > number2) ? number1 : number2;
    }

    public static float min(float number1, float number2){
        return (number1 < number2) ? number1 : number2;
    }

    public static float max(float number1, float number2,float number3){
        if((number1 > number2) && (number1 > number3)){
            return number1;
        }else if((number2 > number1) && (number2 > number3)){
            return number2;
        }else{
            return number3;
        }
    }

    public static float min(float number1, float number2,float number3){
        if((number1 < number2) && (number1 < number3)){
            return number1;
        }else if((number2 < number1) && (number2 < number3)){
            return number2;
        }else{
            return number3;
        }
    }

    public static float quadraticEquation(float a, float b, float c){
        return ((b*b) - (4 * a * c));
    }

    public static int rollDice(){
        return new Random().nextInt(6) + 1;
    }
}
