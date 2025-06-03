package oops;

public class Static {
    static int a = 4;
    static int b;

    static {
        System.out.println("I'm a static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println(Static.a + "     " + Static.b);
    }

}
