package binary_search.interviewPrep;

public class FirstNLast {
    public static void main(String[] args) {

    }

    public int[] searchInRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);  // First Occurrence
        int end = search(nums, target, false);   // Last Occurrence

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    // this function is for the target value
    int search(int[] nums,int target, boolean findStart){
        int ans =-1;
        int start =0;
        int end = nums.length-1;

        while (start <=end){
           int mid = start+(end-start)/2;
            if (target <nums[mid]){
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid +1;
            }else {
                //potential answer has been found
                ans = mid;
                if(findStart){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
