package linear_search;

public class ColNoFixed {
    public static void colnofixed(String[] args){

    int[][] arr= {
        {1,3,5,6},
        {32,65,23,67,87},
        {34,54,2}
    };

    for (int row =0; row < arr.length; row ++){
        for (int col =0; col<arr[row].length; col++){
            System.out.print(arr[row][col]+ " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        colnofixed(args);
    }
}
