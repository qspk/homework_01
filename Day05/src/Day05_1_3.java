
public class Day05_1_3 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        int min = arr[0];
        min = getMin(arr, min);
        System.out.println("最小值为: " + min);
    }
    //求数组最小值
    private static int getMin(int[] arr, int min) {
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
