//1672. Richest Customer Wealth
public class LC1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {23 , 45 , 67},
            {67 , 69 , 69},
            {7 , 56 , 7877}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        int maximum = 0;
        for(int i = 0 ; i<accounts.length; i++){
            int rowSum = 0;
            for(int j = 0 ; j <accounts[i].length; j++){
                rowSum += accounts[i][j];
            }
            maximum = Math.max(maximum , rowSum);
            if(rowSum > maximum){
                maximum = rowSum;
            }
            
        }
        return maximum;
    }
    
}
