public class Day06_2_3 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50, 60};
        System.out.println("最小值为:" + getMin(arr));
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
