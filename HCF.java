import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b : ");
        int b = sc.nextInt();

        int HCF = findHcf(a , b);
        System.out.println("HCF of A and B is : "+ HCF);


    }
    static int findHcf(int a , int b){
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
            
        }
        return a;
    }
    
}
