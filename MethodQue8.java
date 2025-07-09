//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class MethodQue8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        if (isPalaindrom(num)) {
            System.out.println("Num is palindrome");
        } else {
            System.out.println("Num is not palindrome");

        }

    }

    static boolean isPalaindrom(int a) {
        int org = a;
        int sum = 0;
        while (a != 0) {
            int temp = a % 10;
            sum = sum * 10 + temp;
            a /= 10;

        }
        return org == sum;

    }

}
