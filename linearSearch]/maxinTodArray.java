
public class maxinTodArray {
    public static void main(String[]args){
          int [][] matrix = {
            {1 , 2 , 3},
            {23 , 45 , 67 ,88},
            {55 ,69},
            {45 , 77 ,77 , 79}
        };
        int ans = mix(matrix);
        int ans2 = max(matrix);
        System.out.println(ans);
        System.out.println(ans2);
    }
    //method for minimum
    static int mix(int arr[][]){
        if(arr.length == 0) return -1;
        int minimum = Integer.MAX_VALUE;

        //using for loop
        // for(int row = 0; row < arr.length ; row++){
        //     for(int col = 0; col <arr[row].length ; col++){
        //         if(arr[row][col] > maximum){
        //             maximum = arr[row][col];
        //         }
        //     }
        // }

        //INhanced for loop
        for(int []a: arr){
            for(int b : a){
                if(b < minimum){
                    minimum = b;
                }
            }
        }
        return minimum;
    }
    
    //method for maximum
       static int max(int arr[][]){
        if(arr.length == 0) return -1;
        int maximum = Integer.MIN_VALUE;

        //INhanced for loop
        for(int []a: arr){
            for(int b : a){
                if(b > maximum){
                    maximum = b;
                }
            }
        }
        return maximum;
    }
    
}
