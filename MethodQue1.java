 //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
// package functions;

import java.util.Scanner;

public class MethodQue1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value of Num a : ");
        int a = sc.nextInt();
        System.out.print("Enter The value of Num b : ");
        int b = sc.nextInt();
        System.out.print("Enter The value of Num b : ");
        int c = sc.nextInt();
        sc.close();

        maximum(a, b, c);
        minimum(a, b, c);


    }
    static int maximum(int a , int b , int c){
        int largestNum = Math.max(a, Math.max(b, c));

        System.out.println("Largest num : "+largestNum);
        return largestNum;
    }

    static int minimum(int a , int b , int c){
        int SmallestNum = Math.min(a, Math.min(b, c));

        System.out.println("smallest num : "+SmallestNum);
        return SmallestNum;
    }

    
}

