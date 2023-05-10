public class Day06_2_5 {
    public static void main(String[] args) {
//        int key = 2;
        int key = 5;
        int[] brr = {1, 2, 3, 2};
        search(key, brr);
    }

    public static void search(int key, int[] brr) {
        int count = 0;
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] == key) {
                System.out.print(i+" ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组中没有这个数字");
        }
    }
}
