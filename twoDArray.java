import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = {
            {1 , 2 , 3},
            {2 ,4},
            {8 , 9 ,0}
        };
    //   for (int [] a : arr){
    //     System.out.println(Arrays.toString(a));
    //   }
    for(int row =0 ; row < arr.length; row++){
        for(int col = 0; col < arr[row].length; col++ ){
        System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }
        

    }

    
}
