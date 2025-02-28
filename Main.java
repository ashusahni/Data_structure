import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sum();
    }
    static void sum (){
        Scanner in = new Scanner (System.in);
        int num1, num2, sum;

        System.out.print("enter the number for the sum ");
        num1 = in.nextInt();
        System.out.print("enter the second number ");
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println("the sum of num1 and num2 " + sum);

        

    }
    
}

