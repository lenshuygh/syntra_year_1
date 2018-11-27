package playground.chainingmethods;

public class Stringer {
    private String in;

    public Stringer(String in) {
        this.in = in;
    }

    public Stringer add(String input){
        in = in + " " + input;
        return this;
    }

    @Override
    public String toString() {
        return in;
    }
}
