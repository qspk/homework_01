public class Day04_1_4 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 4, 54, 56, 23, 22, 20, 43, 45, 78};
        for (int i : arr) {
            if (i % 6 == 0) {
                System.out.println(i+"可以被6整除");
            }
        }
    }
}
