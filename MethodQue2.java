//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class MethodQue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num =sc.nextInt();

        checkEvenOdd(num);

    }
    static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    
}
