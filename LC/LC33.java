// 33. Search in Rotated Sorted Array
public class LC33{
    public static void main(String[] args) {
        int[] nums = {2 , 3 , 4  ,6 , 7, 8 , 5 , 1 , 0 };
        int target = 6;
        int ans = search(nums , target);
        System.out.println(ans);

    }

    static int search(int[] nums, int target) {
        int pivote = FindPivote(nums);
        if(pivote == -1){
            return BinarySearch(nums , target , 0 , nums.length-1);
        }

        if(target == nums[pivote]){
            return pivote;
        }
        if(target > nums[0]){
            return BinarySearch(nums , target , 0 , pivote - 1);
        }

        return BinarySearch(nums , target , pivote+1  , nums.length- 1);
        
        
    }
    static int FindPivote(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(end > mid && arr[mid] > arr[mid+1]){
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
        return -1;  //if pivote not found
    }
    static int BinarySearch(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start +(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1; // if element not found;
    }
}