//check how many prime Number available till N number;
import java.util.Scanner;

public class primeNumberAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(PrimeNumberCount(num));
       
    }

    static int PrimeNumberCount(int n){
        int count = 0;
        for(int i = 0 ; i<=n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n){
        if( n <= 1) return false;
        int i = 2;
        while(i <= Math.sqrt(n)){
            if(n % i ==0) return false;
            i++;
        }
        return true;

    }
    
}
