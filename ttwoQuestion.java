//take a matrix from user and serch for the gven number X and give its indices at which it occures;

import java.util.Scanner;

public class ttwoQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter The number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The number of Cols");
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0 ; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your number to find");
        int x = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0 ; j < cols; j++){
                if( x== arr[i][j]){
                    System.out.println("NUmber found at ("+ i +" " + j +")");
                }
              
            }
            
        }

    }
    
}
