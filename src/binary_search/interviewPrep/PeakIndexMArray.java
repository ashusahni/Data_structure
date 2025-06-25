package binary_search.interviewPrep;
//biotonic array

public class PeakIndexMArray {
    public static void main(String[] args) {

    }
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public int indexMount (int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in the dec part of the arry
                //this maybe the ans ,but look at the left
                //this is why end != mid +1

                end = mid;
            }else {
                //u are in asc part of array
                start=mid+1;
            }
        }
// in the end , start == end and pointing to the largest number because of the 2 checks above
// start and end are always trying to find max element in the above 2 checks
// hence when they are pointing to juts one element that is the maximum one bceause that is what's the checks says
//more elaboratino at every poiit of time for start and end , they have the best possible answer til that timeand if we are saying that only one item is remaing hence cuz of above line that is the best posssible ans
        return  start;
    }

}
