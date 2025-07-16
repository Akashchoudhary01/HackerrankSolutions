// Ceiling of a number is the smallest number in the array 
// that is greater than or equal to the target.
// Array must be sorted in ascending order for binary search.

public class ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 33, 41, 56, 56, 69, 70, 100 }; // Sorted input array
        int target = 51;

        int ans = CeilingBS(arr, target);

        if (ans == -1) {
            System.out.println("Ceiling doesn't exist for the given target.");
        } else {
            System.out.println("Ceiling is: " + arr[ans] + " at index " + ans);
        }
    }

    // Function to find ceiling of target in sorted array
    static int CeilingBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check if the target is greater then the greatest no of the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
