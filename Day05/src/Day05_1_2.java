public class Day05_1_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenNumberSum = 0;
        int oddNumberSum = 0;
        int sum = 0;
        evenNumberSum = getEvenNumberSum(arr, evenNumberSum);
        oddNumberSum = getOddNumberSum(arr, oddNumberSum);
        sum = getSum(arr, sum);
        System.out.println("偶数和为:" + evenNumberSum);
        System.out.println("奇数为和:" + oddNumberSum);
        System.out.println("总和为:" + sum);
    }
    //求偶数和
    private static int getEvenNumberSum(int[] arr, int evenNumberSum) {
        for (int j : arr) {
            if (j % 2 == 0) {
                evenNumberSum += j;
            }
        }
        return evenNumberSum;
    }
    //求奇数和
    private static int getOddNumberSum(int[] arr, int oddNumberSum) {
        for (int j : arr) {
            if (j % 2 != 0) {
                oddNumberSum += j;
            }
        }
        return oddNumberSum;
    }
    //求总和
    private static int getSum(int[] arr, int sum) {
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
