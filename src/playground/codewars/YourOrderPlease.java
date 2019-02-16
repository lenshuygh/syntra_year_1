package playground.codewars;

public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
    }

    public static class Order {
        public static String order(String words) {
            if(words.length() == 0){
                return "";
            }
            String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
            String wordsArr[] = words.split(" ");
            String[] orderedWordsArr = new String[wordsArr.length+1];
            for (String word : wordsArr){
                for(int l = 0;l<word.length();l++){
                    for (String num : nums) {
                        if(num.equals(word.substring(l,l+1))){
                            orderedWordsArr[Integer.parseInt(num)] = word;
                            continue;
                        }
                    }
                }
            }
            String out= "";
            for(String w: orderedWordsArr){
                if(w != null) {
                    out += w + ' ';
                }
            }
            out = out.substring(0,out.length()-1);
            return out;
        }
    }
}
