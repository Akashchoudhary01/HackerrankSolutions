public class demo {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int mul = 1;

        while (num > 0) {
            int temp = num%10;
            sum = temp +sum;
            mul = temp *mul;
            num/=10;

            
        }
        System.out.println(sum +" "+ mul);
    }
    
}
