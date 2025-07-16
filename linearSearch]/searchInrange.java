public class searchInrange {
    public static void main(String[] args) {
        int[] arr =  { 1 , 22  ,33 , 22 , 66 ,77 , 88 ,-5444};
        int Target = -222;
        int ans = searchLinearRange(arr , Target , 2 , 6);
        System.out.println(ans);

    }
    static int searchLinearRange(int[] arr , int Target , int start , int end ){
        if(arr.length == 0 ) return -1;
        if(start > end) return -1;

        for (int i = start ; i <= end; i++) {
            if(Target == arr[i]) return i;
        }
        return -1;
    }
    
}
