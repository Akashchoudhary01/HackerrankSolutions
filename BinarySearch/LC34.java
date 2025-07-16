// 34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class LC34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = indexValue(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] indexValue (int[] nums , int target){
    int[] ans = {-1 , -1};
    int start = search(nums, target, true);
    int end = search(nums, target, false);

    ans[0] = start;
    ans[1] = end;

    return ans;
    }
    static int search(int []arr , int target , boolean firstStartSearch){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <=end) {
            int mid = start +(end -start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(firstStartSearch == true){
                    end = mid-1;
                }else{
                    start = mid +1;
                }

            }
            
        }
        return ans;
    }

}
