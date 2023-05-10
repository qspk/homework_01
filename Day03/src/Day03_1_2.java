public class Day03_1_2 {
    public static void main(String[] args) {
        int num = 1543;
        int count = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                count++;
            }
            num/=2;
        }
        System.out.println("扔掉了" + count + "颗核桃"); //5
    }
}
