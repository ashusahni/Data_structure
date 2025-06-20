public class Infinite {

    public static void main(String[] args) {
        int[] arr = new int[100000]; // simulate "infinite" array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // sorted even numbers
        }

        int target = 64;
        int index = findPosition(arr, target);
        System.out.println("Element found at index: " + index);
    }

    // Main method to find the position
    public static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range exponentially until target <= arr[end]
        while (end < arr.length && arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Apply binary search in the found range
        return binarySearch(arr, target, start, Math.min(end, arr.length - 1));
    }

    // Standard binary search
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1; // Not found
    }
}
