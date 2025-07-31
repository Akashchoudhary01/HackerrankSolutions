public class SearchIn2dShorted {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4, 5 },
                { 6,  7,  8,  9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } 
        };
        int target = 22;

        // Calling SearchMatrix and printing result
        int[] ans = SearchMatrix(matrix, target);
        if (ans[0] != -1) {
            System.out.println("Target found at: [" + ans[0] + ", " + ans[1] + "]");
        } else {
            System.out.println("Target not found.");
        }
    }

    // Wrapper method
    static int[] SearchMatrix(int[][] matrix, int target) {
        return search(matrix, target);
    }

    // Binary search within a row
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1}; // not found
    }

    // Main 2D matrix search using divide and conquer
    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        if (row == 1) {
            return binarySearch(arr, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        // Reduce to two rows
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check middle column of two rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (rStart + 1 < row && arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // 4 quadrants
        // 1st quadrant: top-left
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // 2nd quadrant: top-right
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][col - 1]) {
            return binarySearch(arr, rStart, cMid + 1, col - 1, target);
        }
        // 3rd quadrant: bottom-left
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        // 4th quadrant: bottom-right
        else {
            return binarySearch(arr, rStart + 1, cMid + 1, col - 1, target);
        }
    }
}
