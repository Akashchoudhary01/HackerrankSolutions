// 1295. Find Numbers with Even Number of Digits
public class LC1295 {
    public static void main(String[] args) {
        int[] nums = {12 , 333 , 4333 , 12 , 12345  , 2344};
        int ans = evenCount(nums);
        System.out.println(ans);

    }
    static int evenCount(int[] arr){
        int count = 0;
        for(int ans : arr){
            if(isEven(ans))
            count++;
        }
        return count;
    }

    
    static boolean isEven(int a){
        int digits = numsLength(a);
        return (digits % 2 ==0) ;

    }
    static int numsLength(int n){
        int count = 0;
        while ( n >0) {
            count++;
            n /=10;
        }
        return count;
    }


    
}
