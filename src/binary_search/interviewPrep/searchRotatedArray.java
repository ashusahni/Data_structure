package binary_search.interviewPrep;

public class searchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {21,25,26,3,4,6,7,9,12,15,16,};
        int target = 21;
        int targetIndex = search(arr,target);
        System.out.println(targetIndex);
    }

    static int search (int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start <=end){
            int mid = start + (end - start) /2 ;

            if (arr[mid]== target){
                return  mid;
            }


        if(arr[start]<=arr[mid]) {
            //if target lies on left sorted
            if(target >= arr[start] && target < arr[mid] ){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        if(arr[mid] <= arr[end]) {
            //if target lies on right half
            if(target >= arr[mid] && target < arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }

        }
    return -1;
    }
}
