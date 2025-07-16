import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of your Arrays");
        sc.close();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int n : arr){
            System.out.print("Element in array : "+n);
        }
        System.out.println("Maxium num is : "+MaxOf(arr));
        


        

    }

    static int MaxOf(int[] arr) {
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];

            }

        }
        return maxValue;
    }
}