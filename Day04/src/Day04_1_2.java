public class Day04_1_2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8,10};
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 1) {
                System.out.print(num[i] + " ");
            }
            if (num[i] % 2 == 1) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
