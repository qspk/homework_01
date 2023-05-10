public class Day05_1_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr);
    }

    //打印数组
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }
}
