public class Infinite {

    public static void main(String[] args) {
       int[] arr = {2,4,7,23,32,35,43,45,67,67};
       int target = 43;
        System.out.println(ans(arr,target));
   }

   static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        // conditon for the target to lie in the range
       while (target >arr[end]){
          int temp = end+1; //this is new start
           //double the box value
           //end = previous end + sizeofbox*2

           end = end + (end-start+1)*2;
           start =temp;

           // to avoid ArrayIndexOutOfBoundsException in this finite example
           if (end >= arr.length) {
               end = arr.length - 1;
               break;
           }
       }
       return  binarySearch(arr,target,start,end);
   }


       static int binarySearch(int[] arr, int target, int start,int end){
        while(start <=end){
            int mid = start + (end-start)/2;

            if(target <arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else {
                return mid;

            }
        }
        return -1;
       }



}
