package binary_search;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
    int[] arr = {1,3,5,6,8,12,14,15,21,25,26,30,32,36,37};
    int target= 25;
    int ans = orderAgnoBinary(arr,target);
        System.out.println(ans);
// find wheter arrary is sorted in ascending or decending
    }

    static  int orderAgnoBinary(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc =false;
        }
return  -1;
    }

}
