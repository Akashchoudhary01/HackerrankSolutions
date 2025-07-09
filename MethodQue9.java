//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class MethodQue9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first and Last numbar : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = num1 ; i<=num2; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n){
        if(n <=1) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
}
