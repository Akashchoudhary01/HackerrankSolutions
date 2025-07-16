// 1672. Richest Customer Wealth
// This program finds the maximum wealth among all customers.
// Each row in the 2D array represents a customer, and each column is their bank account balance.

public class mexWelth {
    public static void main(String[] args) {
        // 2D array where each row is a customer's bank accounts
        int arr[][] = {
            {22, 33, 22},       // Customer 0
            {12, 3, 12},        // Customer 1
            {233, 2},           // Customer 2
            {69, 76, 69 , 69}        // Customer 3
        };

        // Call the maximum method to find the richest customer
        int ans = maximum(arr);
        
        // Print the maximum wealth
        System.out.println(ans);
        int maxAccounts = Integer.MIN_VALUE;
        int customerIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int accountCount = arr[i].length; // number of accounts for this customer
            if (accountCount > maxAccounts) {
                maxAccounts = accountCount;
                customerIndex = i;
            }
        }

        System.out.println("Customer with the most accounts: " + customerIndex);
        System.out.println("Number of accounts: " + maxAccounts);
    }

    // This method returns the maximum wealth among all customers
    static int maximum(int[][] arr) {
        // Initialize maximum to the smallest possible integer
        int maximum = Integer.MIN_VALUE;

        // Loop through each customer (each row)
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0; // Reset rowSum for each customer

            // Loop through each account of the current customer
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j]; // Add up account balances
            }

            // Update maximum if this customer's wealth is greater
            if (rowSum > maximum) {
                maximum = rowSum;
            }
        }

        // Return the richest customer's wealth
        return maximum;
    }
}
