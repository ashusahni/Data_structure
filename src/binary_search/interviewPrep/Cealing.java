package binary_search.interviewPrep;

import com.sun.source.tree.BreakTree;

public class Cealing {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 19, 34, 56};
        int target = 16;
        int ceiling = findCeiling(arr, target);

        if (ceiling == -1)
            System.out.println("No ceiling found.");
        else
            System.out.println("Ceiling of " + target + " is: " + ceiling);
    }

    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // If target is greater than the largest element
        if(target >arr[end]) return -1;
        while (start <=end){
           int mid = start+ (end-start)/2;

            if(arr[mid] == target){
                return  arr[mid];
            }
            else if(arr[mid]<target){
                start =mid +1;
            }
            else {
                end = mid-1;
            }

        }

      // start points to the smallest number >= target
    return arr[start];
    }


}
