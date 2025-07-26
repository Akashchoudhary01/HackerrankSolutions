public class findPivote {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 8, 6, 4, 2};  // Example rotated array
        int ans = pivot(arr);  // Call pivot finder
        System.out.println("Pivot found at index: " + ans);
    }

    // Function to find pivot index in a rotated sorted array
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // To avoid overflow

            // --------------------------
            // Case 1: Pivot found at mid
            // If current element is greater than next → this is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // --------------------------
            // Case 2: Pivot is at mid - 1
            // If previous element is greater than current → previous is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // --------------------------
            // Case 3: Decide search space
            // If left part is sorted, move to right
            if (arr[mid] >= arr[start]) {
                // Pivot must be in the right half
                start = mid + 1;
            } else {
                // Pivot must be in the left half
                end = mid - 1;
            }
        }

        return -1; // If no pivot found (fully sorted array)
    }
}
