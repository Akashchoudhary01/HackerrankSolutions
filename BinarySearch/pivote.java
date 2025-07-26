public class pivote{
    public static void main(String[] args) {
        int arr[] = {3 , 4 , 5 , 6 ,9 , 12 , 11 , 8 , 7 , 2 , 1};
        int ans = pivot(arr);
        System.out.println(ans);
        System.out.println(arr[ans]);
        
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[mid] >= arr[start]){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
 }
