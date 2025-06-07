package binary_search;

import com.sun.source.tree.BreakTree;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {-18,-13,-10,0,2,5,7,10,15,20,24,32,43};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[]arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start <=end){
             int mid = start+(end-start)/2;

             if (target < arr[mid]){
                 end =mid-1;
             }
             else if (target>arr[mid]){
                 start= mid+1;

             }
             else {
                 return mid;
             }

        }
    return -1;
    }

}
