import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits){


            case "mango" -> System.out.println("a sweet sour fruit");


            case  "apple"  ->  System.out.println("red round fruit");


            case  "guawawa" -> System.out.println("a fruites hwich i love te most ");


            default ->  System.out.println("who did u get the spill from who got more shoes than aprocoss");

        }

    }
}
