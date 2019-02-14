package playground.codewars;

public class CharrArray {
    public static void main(String[] args) {
        String test = "abracadabra";
        int vowelsCount = 0;

        String vowels = "aeiou";
        for (int i = 0; i < test.length(); i++) {
            String letter = test.substring(i,i+1);
            if(vowels.contains(letter)){
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);

    }
}
