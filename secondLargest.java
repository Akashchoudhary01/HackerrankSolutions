public class secondLargest{
    public static void main(String[] args) {
        int []arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,6};
        int ans = secondLarge(arr);
        System.out.println(ans);

    }
    static int secondLarge(int[] arr){
        if(arr.length ==0) return -1;
        int maximum = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;
         
        for(int ans: arr){
            if(ans > maximum){
                secondLarg = maximum;
                maximum = ans;
            }else if(ans > secondLarg && ans != maximum){
                secondLarg = maximum;
            }

        } 
        return secondLarg;
    }
}