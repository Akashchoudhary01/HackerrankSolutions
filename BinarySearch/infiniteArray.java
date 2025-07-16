// Problem: Find position of an element in a sorted array of infinite size.
// Since we can't know the length of an infinite array, we can't use arr.length.
// So, we first find a range where the target might lie and then apply Binary Search.

public class infiniteArray {
    public static void main(String[] args) {
        // Simulating an infinite sorted array (in real problems, this could be an API or custom accessor)
        int[] nums = { 1, 2, 3, 5, 7, 9, 12, 17, 22, 26, 29, 33, 44, 49, 56, 69,
                       79, 88, 90, 100, 122, 123, 126 , 127 , 128 , 129 , 130 , 234 , 345 , 567 , 678 , 789 };
        
        int target = 69; // Target value to search for
        
        // Call to the main function that handles the infinite array logic
        System.out.println(answer(nums, target));
    }

    // This function finds the suitable range first, then performs Binary Search in that range
    static int answer(int[] nums, int target) {
        int start = 0;
        int end = 1;

        // Step 1: Expand the range exponentially until the target <= nums[end]
        while (target > nums[end]) {
            // Store the new start as one index after current end
            int newStart = end + 1;

            // Double the box size: (end - start + 1) is the current range length
            // So new end = end + size * 2
            end = end + (end - start + 1) * 2;

            // Update the start to newStart
            start = newStart;

            // In a real infinite array, we would also add a boundary check here (e.g., try-catch or API check)
        }

        // Step 2: Perform Binary Search in the found range
        return BinarySearch(nums, target, start, end);
    }

    // Standard Binary Search algorithm between the given start and end indices
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // Avoids integer overflow
            int mid = start + (end - start) / 2;

            // If target is greater, ignore left half
            if (target > arr[mid]) {
                start = mid + 1;
            } 
            // If target is smaller, ignore right half
            else if (target < arr[mid]) {
                end = mid - 1;
            } 
            // Target is found
            else {
                return mid;
            }
        }

        // If target not found, return -1
        return -1;
    }
}
