package intro;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numValue = in.nextInt();

        while (numValue <5){
            System.out.println(numValue);
            numValue ++;
        }

    }
}
