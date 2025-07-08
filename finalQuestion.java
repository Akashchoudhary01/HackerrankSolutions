// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class finalQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        System.out.println("Start entering Numbers: ");
        while(true){
            int N = sc.nextInt();

            if(N ==0 ){
                break;
            }else if(N < 0 ){
                negSum += N;
            } else if(N >0 && N%2 ==0){
                positiveEvenSum +=N;
            }else if(N >0 && N%2 !=0){
                positiveOddSum +=N;
            }

           
        }
        System.out.println("sum of negative numbers: "+negSum);
        System.out.println("sum of positive even numbers : "+ positiveEvenSum);
        System.out.println("sum of positive odd numbers"+positiveOddSum);

        sc.close();




    }
}
