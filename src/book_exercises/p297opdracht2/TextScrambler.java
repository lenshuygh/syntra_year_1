package book_exercises.p297opdracht2;

public class TextScrambler {
    public String scramble(String s) {
        String out = "";
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a':
                    out += "@";
                    break;
                case 'e':
                    out += "€";
                    break;
                case 'l':
                    out += "1";
                    break;
                case 'o':
                    out += "0";
                    break;
                default:
                    out += "" + c;
            }
        }
        return out;
    }
}
