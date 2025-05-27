package ashu;

import java.util.Arrays;

public class Array2d   {
    public static void main(String[] args) {
        int[][] arr = {
                {34,43,23,54},
                {24,563,23,74},
                {14,53}
        };
        int target = 53;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(max(arr)));
    }

    static  int[]  search(int[][] arr, int target){
        for (int row =0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return  new int[]{-1,-  1};
    }

    //max value
    static  int[]  max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return new int[]{max};
    }
}
