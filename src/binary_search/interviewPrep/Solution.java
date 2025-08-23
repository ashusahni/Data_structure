package binary_search.interviewPrep;

class Solution {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);  // at least the max element
            right += num;                // at most the total sum
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;  // try smaller max sum
            } else {
                left = mid + 1;  // need bigger max sum
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, currentSum = 0;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = 0;
            }
            currentSum += num;
            if (count > k) return false;
        }
        return true;
    }
}
