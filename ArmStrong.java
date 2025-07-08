import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first number: ");
        int n = sc.nextInt();

        System.out.println("Enter the number till where you went to check");
        int lastNum = sc.nextInt();

        for(int i = n ; i<=lastNum ; i++){
            if (isarmStrong(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isarmStrong(int num) {
        int org = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        //
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return (org == sum);

    }
}
