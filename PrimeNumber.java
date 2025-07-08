import java.util.Scanner;

// public class PrimeNumber {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Your Number");
//     int num = sc .nextInt();
//     boolean result = isPrime(num);
//     if(result){
//         System.out.println(num +" is a prime Number");
//     }else{
//         System.out.println(num +" is not a prime Number");

//     }
// }
// static boolean isPrime(int num){
//     if(num <=0) return false;
//     int i = 2;
//     while (i <= Math.sqrt(num)) {
//         if(num % i == 0) return false;
//         i++;
//     }
//     return true;

// }
// }

//  print all prime numbers in a given range, 

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int num1 = sc.nextInt();

        System.out.println("Enter the end number");
        int num2 = sc.nextInt();

        for(int i = num1; i<=num2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }
    static boolean isPrime(int num){
        if(num <= 1) return false;
        int i = 2;
        while (i<=Math.sqrt(num)) {
            if(num % i == 0) return false;
            i++;
            
        }
        return true;

    }
}