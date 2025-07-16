import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
     // Creating a Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Creating and initializing an array of integers
        int[] nums = {12, 22, 45, 67, 69, 43, 33, -5, -1};

        // Asking user to enter the number (target) to search in array
        System.out.println("Enter The Target : ");
        int Target = sc.nextInt();  // Reading the target val 

    // Calling linearSearch method and storing result in 'ans'
       int ans = linearSearch(nums , Target);
       System.out.println(ans);

       sc.close();
        

    }
    
    // This method searches for the target value in the array
    // If found, returns the index where it was found
    // If not found, returns -1 (because -1 is not a valid index)
    static int linearSearch(int []arr , int Target){
        if(arr.length == 0 ) return -1;   //if arr is empty it directly return -1;

        for(int i = 0; i < arr.length ; i++){     // Loop through each element of the array
            int element = arr[i];                   // Store current element
            if(element == Target) return i;        // // If current element is equal to target, return index
        }
        return -1;                   // If loop ends and target is not found, return -1
    }

}