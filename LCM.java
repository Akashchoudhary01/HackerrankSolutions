import java.util.Scanner;

public class LCM {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b : ");
        int b = sc.nextInt();

        int HCF = findHcf(a , b);
        int LCM = a*b/HCF;
        System.out.println("LCM of A and B is : "+ LCM);
        sc.close();


    }
    static int findHcf(int a , int b){
        while(b != 0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }
    
    
}
