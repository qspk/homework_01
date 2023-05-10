public class Day04_2_4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num *= 10;
            num += arr[i];
        }
        System.out.println("该整数为:" + num);
/*        int[] arr = {2, 1, 3, 5, 4};
        int num = 0;
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            num += arr[i] * Math.pow(10, j);
            j++;
        }
        System.out.println("该整数为:" + num);*/
    }
}
