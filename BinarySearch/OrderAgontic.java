
public class OrderAgontic {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 69, 78, 78, 90, 999 };
        // int[] arr = {99 , 87 , 69 , 66 , 54 , 32 , 21 , 21 , 12 , 1};
        int target = 69;
        int ans = orderAgomticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgomticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending  =(arr[start] < arr[end]);

        while(start <= end){
            int middle = start + (end - start) / 2;
           if (target == arr[middle])
        return middle;

        if (isAscending) {
            if (target > arr[middle]) {
                start = middle + 1;

            } else if (target < arr[middle]) {
                end = middle - 1;
            }
        } else {
            if (target > arr[middle]) {
                end = middle - 1;

            } else if (target < arr[middle]) {
                start = middle + 1;
            }
        }
    }

        return -1; // if target is not available in the array
    }
}