import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // fixed i -> j
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // fixed i -> j
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
