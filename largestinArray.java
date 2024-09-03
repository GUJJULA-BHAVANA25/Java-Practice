public class largestinArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 9, 1, 0, 100 };
        int maximum = Integer.MIN_VALUE;
        ;

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            if (curr > maximum) {
                maximum = curr;

            }

        }
        System.out.println(maximum);
    }
}
