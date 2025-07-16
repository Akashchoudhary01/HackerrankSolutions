// floor of a number is the greatest number in the array 
// that is smallest than or equal to the target.
// Array must be sorted in ascending order for binary search.

public class floor {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 41, 56, 56, 69, 70, 100}; // Sorted input array
        int target = 68;

        int ans = floorBS(arr, target);
        
        if (ans == -1) {
            System.out.println("floor doesn't exist for the given target.");
        } else {
            System.out.println("floor is: " + arr[ans] + " at index " + ans);
        }
    }

    // Function to find ceiling of target in sorted array
    static int floorBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Binary Search
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1; // Move right
            } else if (target < arr[middle]) {
                end = middle - 1; // Move left
            } else {
                return middle; // Exact match found
            }
        }

        // At this point, 'end' is at the index of the floor (if it exists)
        if (end == arr.length) {
            return -1; // No ceiling exists (target > last element)
        }

        return end; // Index of the ceiling element
    }
}
