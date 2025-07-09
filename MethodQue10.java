//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class MethodQue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbar N : ");
        int N = sc.nextInt();
        sumofNum(N);
        

    }
    static void sumofNum(int a){
        int sum = 0;
        for(int i = 1 ; i<=a; i++ ){
            sum +=i;
        }
        System.out.println(sum);
    }
    
}
