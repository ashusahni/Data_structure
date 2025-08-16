
package binary_search;

public class rowCol {
    public static void main(String[] args) {
    int[][] arr = {
            {},
            {},
            {}
       };

    }

    static int[] search(int[][] matrix, int target){

        int rows = 0;
        int column = matrix.length-1;

        while (rows < matrix.length && column >=0){
            if (matrix[rows][column]==target){
                return  new int[] {rows,column}
            }
        }

    }

}

