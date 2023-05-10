public class Day04_2_8 {
    public static void main(String[] args) {
        int[] arr0 = {2, 52, 645, 34, 56, 34, 6, 77, 59, 33};
        int length = arr0.length;
        int i = 0;
        int j = 1;
        int[] arr = new int[length];
        for (int k = 0; k < length; k++) {
            if (arr0[k] % 2 != 0) {
                arr[i] = arr0[k];
                i++;
            } else {
                arr[length - j] = arr0[k];
                j++;
            }
        }
        System.out.println("新数组为:");
        for (int i1 : arr) {
            System.out.print(i1+" ");
        }
    }
}
