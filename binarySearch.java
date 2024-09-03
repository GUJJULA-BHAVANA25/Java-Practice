public class binarySearch {
    /*
     * Array should in sorted manner.
     * mid,first,last
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        int index = search(arr, target);
        System.out.println(index);

    }

    static int search(int[] arr, int target) {
        int mid, low = 0, high = arr.length;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid + 1;
            }
        }
        return -1;
    }

}
