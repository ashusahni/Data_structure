import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for (int num=1; num <= 5; num++){
//            System.out.println(num);
//        }

        /*
        for loops
         */

//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int num = 0; num <=n ; num++) {
//            System.out.println("house of dragon");
//        }
//
//

        //while loops//

//        int num = 1;
//        while (num <=5) {
//            System.out.println(num);
//            num++;
//        }

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);
    }
}
