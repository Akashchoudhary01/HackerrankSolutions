import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 6, 8, 9 };
        int target = 4;

        System.out.println(Arrays.toString(searchIndex(arr, target)));
    }

    static int[] searchIndex(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean firstStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return ans;
    }

}