public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,0,0,1,2};
        int target = 0;
        int ans = findTarget(arr , target);
        System.out.println(ans);
    


    }
    static int findTarget(int[] nums , int target){
        int pivote = pivotInRotatedArray(nums);

        if(pivote == -1){
            return BinarySearch(nums, target, 0 , nums.length-1);
        }
        if(target == nums[pivote]){
            return pivote;
        }
        if(target >= nums[0]){
            return BinarySearch(nums, target, 0, pivote -1);
        }

        return BinarySearch(nums, target, pivote + 1, nums.length-1);
    }

    static int pivotInRotatedArray(int []arr){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start <mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // if element at start , end & middel are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                //but What if the element at start and end are pivote
                //check if the start is pivote

                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;  //if not then skip the start element
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end --;  //if not then skip the end element
            } //left side is sorted so we check if the pivote should be in right side
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    static int BinarySearch(int[] arr , int target , int start , int end){
        int ans = -1;
        while(start <= end){
            int mid = start +(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans; // if element not found;
    }
    
}
