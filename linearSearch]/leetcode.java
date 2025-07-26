//1295. Find Numbers with Even Number of Digits

public class leetcode {
    public static void main(String[] args) {
        int []nums = {12 , 43 , 3333 , 23 , 54 , 22 ,222 ,3};
        System.out.println(findNumber(nums));
        
    }
    static int findNumber(int [] nums){
        int count = 0;
        for(int ans : nums){
            if(isEven(ans)){
                count++;
            }
        }
        return count;

    }
    //For checking is the given numbeer is Even or not
    static boolean isEven(int num){
        int noofDigit = Countdigits(num);
        return (noofDigit % 2==0);
    }
    //Count no of digits in array
    static int Countdigits(int n){
        if(n < 0){  //negative no test check
            n *= -1;
        }
        return (int)(Math.log10(n))+1;
       
    }
}