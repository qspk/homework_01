public class Day04_2_1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
