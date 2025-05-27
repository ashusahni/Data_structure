package ashu;

import java.util.Arrays;

public class Multidimension {
    public static void multidimension(String[] args) {
        int[][] matrix = new int[3][3];  // 3x3 matrix

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        multidimension(args);
    }
}


