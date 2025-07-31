public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {2 , 2 , 2 , 5 , 6 , 7 , 9, 1 , 2 , 2};
        int ans = PivoteInRotatedDupilcateArray(arr);
        System.out.println(ans);
        System.out.println(arr[ans]);
        
    }
    static int PivoteInRotatedDupilcateArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end >= start){
            int mid = start+(end-start)/2;

            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            //check if start == end == mid both are equal

            if(arr[start] == arr[mid] || arr[mid] == arr[end]){
             //check by any chance start is pivote if it is pivote then return it otherwise skipp the start
             if(arr[start] > arr[start+1]){
                return start;
             }
             start++;
             //same with end
             if(arr[end] < arr[end-1]){
                return end-1;
             }
             end--;
            //Right side is sorted so we check in the left side
             }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1; // if not found
    }
    
}
