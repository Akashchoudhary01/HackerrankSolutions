// Binary Search Implementation in Java
public class first {

    public static void main(String[] args) {
        // Initialize a sorted array
        int[] arr = {88, 77, 66, 55, 44, 22, 1, 0, -11, -22, -33};
        
        // Target element to search for
        int Target = 66;
        
        // Call BinarySearch function and store the result (true/false)
        int ans = BinarySearch(arr, Target);
        
        // Print the result
        System.out.println(ans);
    }

    // Binary search function returns true if target found, false otherwise
    static int BinarySearch(int[] a, int Target) {
        int start = 0;               // Start index of array
        int end = a.length - 1;      // End index of array

        // Loop until start index is less than or equal to end
        while (start <= end) {
            // Calculate middle index to avoid overflow
            int middle = start + (end - start) / 2;

            // If target is greater, ignore left half
            if (Target > a[middle]) {
                end = middle - 1;
            }
            // If target is smaller, ignore right half
            else if (Target < a[middle]) {
                start = middle + 1;
            }
            // If target is equal to middle element, return true
            else {
                return middle;
            }
        }

        // If loop ends and element not found, return false
        return -1;
    }
}
