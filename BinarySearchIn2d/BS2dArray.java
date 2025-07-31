//Matrix is shorted in row wise and col wise manner fing the index of the given target value

import java.util.Arrays;

public class BS2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {10 , 20 , 30 , 40},
            {15 , 25 , 35 , 45},
            {17 , 27 , 59 ,  77},
            {65 , 68 , 69 , 77}
        };
        System.out.println(Arrays.toString(BSin2DArray(matrix , 69)));
        
    }
    static int[] BSin2DArray(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return new int[]{r , c};
            }
            if(matrix[r][c] < target){
                r ++;
            }else{
                c--;
            }
        }
        return new int[]{-1 , -1}; // Value not found
    }

    
}