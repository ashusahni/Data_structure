package intro;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        int start = 0;

        while (start <n){
         int next= second;
         second = first + second;
         first = next;

            start++;
        }
        System.out.println(second);

    }
}
