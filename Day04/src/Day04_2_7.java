public class Day04_2_7 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int negativeCount = 0;
        int positiveCount = 0;
        for (double v : arr) {
            if (v > 0) {
                positiveCount++;
            } else if (v < 0) {
                negativeCount++;
            }
        }
        System.out.println("赚钱的股票一共有: " + positiveCount + "只");
        System.out.println("赔钱的股票一共有: " + negativeCount + "只");
    }
}
