// Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class MethodQue5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Number "+ num +" is a prime number");
        }else{
            System.out.println("Number "+ num +" is not a prime number");

        }
        sc.close();

    }
    static boolean isPrime(int n){
        if(n <=1) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i ==0) return false;
        }
        return true;
    }
    
}
