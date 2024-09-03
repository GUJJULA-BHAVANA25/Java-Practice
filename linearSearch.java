
public class linearSearch {
    public static void main(String args[]) {
        int[] arr = { 1, 10, 5, 2, 5, 6, 7, 8 };
        System.out.println(arr.length);
        int target = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i + "Element is found");
                break;
            }
        }
    }
}
