package playground.codewars;

public class Wub {
    public static void main(String[] args) {
        System.out.println("|"+SongDecoder("RWUBWUBWUBLWUB")+"|");


    }

    private static String SongDecoder(String song) {
        String[] words = song.split("WUB");
        String out = "";
        for(String word : words){
            out += (word.equals("")) ? "" : word + ' ';
        }
        return out.trim();
    }

}
