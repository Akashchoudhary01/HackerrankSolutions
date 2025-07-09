//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.

import java.util.Scanner;

public class MethodQue7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        System.out.println(checkFactorial(num));
        

        sc.close();
    }
    static long checkFactorial(int a){
        long fact = 1;
        for(int i = 1; i<=a; i++){
            System.out.print(i+" ");
            fact *=i;
        }
        return fact;
    }
    
}
