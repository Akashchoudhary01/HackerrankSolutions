// find the index of an element in an infinite array
public class amazonQue {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 14 , 15 , 16 , 18 , 19 , 69 , 98 , 100};
        int target = 69;
        int ans = SearchRange(arr, target);
        System.out.println(ans);
        System.out.println(arr[ans]);

    }
    static int SearchRange(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            //store our start in a temperary variable
            int temp = start;
             // new End will be end + length of the previous arr * 2;
            end = end +(end - start +1)*2;
            start = temp;
        }
        return Search(arr, target, start, end);

    }
    static int Search(int[] arr , int target , int start , int end ){
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1; //if element not found in array;

    }
}