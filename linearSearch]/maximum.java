// Main class
public class maximum {

    // Main method: this is where the program starts running
    public static void main(String[] args) {

        // Creating and initializing an array
        int arr[] = {1, 33, 43, 54, -69, 69, 53};
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Calling maximum() method and printing the largest number
        System.out.println(maximumNum(arr));

        // Calling minimum() method and printing the smallest number
        System.out.println(minimum(arr));
    }

    // Method to find the maximum (largest) number in the array
    static int maximumNum(int[] arr) {
        // Start with the smallest possible integer value
        int maximum = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is bigger than current maximum
            if (arr[i] > maximum) {
                // Update maximum value
                maximum = arr[i];
            }
        }

        // Return the largest number found
        return maximum;
    }

    // Method to find the minimum (smallest) number in the array
    static int minimum(int[] arr) {
        // Start with the largest possible integer value
        int minimum = Integer.MAX_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is smaller than current minimum
            if (arr[i] < minimum) {
                // Update minimum value
                minimum = arr[i];
            }
        }

        // Return the smallest number found
        return minimum;
    }
}
