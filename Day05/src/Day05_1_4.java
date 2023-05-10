public class Day05_1_4 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        int x = 9;
        int count = getCount(arr, x);
        System.out.println("元素 "+x + " 出现了 " + count + " 次"); //4次
    }

    private static int getCount(int[] arr, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }
}
