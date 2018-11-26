public class p124StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //sb.append(" World");
        System.out.println(sb);

        String hello = "Hello";
        hello.concat(" World");
        System.out.println(hello);

        StringBuilder sb2 = sb.append(" world");
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println("sb == sb2 ? -> " + (sb == sb2));

    }
}
