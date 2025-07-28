// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class no {

    public static void main(String[] args) {
        int arr[] = {2 , 4 , 5 ,6 ,7 ,4 , 3 , 1 };
        int ans = findPivot(arr);
           System.out.println("Pivot index: " + ans);
        System.out.println("Pivot value: " + arr[ans]);
        
    }
    static int findPivot(int []arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;  // if not found;
    }
}