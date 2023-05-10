public class Day04_1_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("最小数为:"+min);
    }
}
