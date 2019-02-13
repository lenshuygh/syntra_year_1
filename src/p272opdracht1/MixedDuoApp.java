package p272opdracht1;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String,Integer> mixedDuo = new MixedDuo<>("Thor",13);
        System.out.println(mixedDuo.getFirst());
        System.out.println(mixedDuo.getSecond());

        System.out.println("--------------");

        String[] strings = {"Thor","Smiegel"};
        MixedDuo<Integer,String[]> mixedDuo2 = new MixedDuo<>(10,strings);
        System.out.println(mixedDuo2.getFirst());
        for (String s : mixedDuo2.getSecond()) {
            System.out.println(s);
        }
    }
}
