public class MaxArrayInRange {
    public static void main(String[] args) {
        int[] arr = { 12 ,34 , 32 , 78 , 97 , 45 ,23 , 43 ,23 , 54 ,34 ,542 ,654, 32};
        System.out.println(MaxINRange(arr , 1 , 8));
    }
    static int MaxINRange(int[] arr , int start , int end){
        if(start > end) return -1;
        if(arr == null) return -1;
        int MaxArray = arr[start];
        for(int i = start ; i <=end ; i++){
            if(arr[i] > MaxArray){
                MaxArray = arr[i];
            }
        }
        return MaxArray;
    }
    
}
