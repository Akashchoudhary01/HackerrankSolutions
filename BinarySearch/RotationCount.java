public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 3, 2, 1, 0 };
        System.out.println(Rotation(arr));
    }

    static int Rotation(int[] arr) {
       int pivote =  FindPivote(arr);
       return pivote+1;



    }

    static int FindPivote(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid = 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }else{
                start = mid+1;
            }


        }
        return -1;
    }

}
