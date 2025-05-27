package ashu;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int [][] array = {
                {34,32,45,6},
                {33,12,5},
                {36,66,35,76}
        };

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] ans = search(array,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search (int[][] array,int target) {
        for (int row=0; row < array.length; row ++){
            for (int col = 0; col < array[row].length; col++){
                if(array[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }               return  new int[]{-1,-  1};
    }

}