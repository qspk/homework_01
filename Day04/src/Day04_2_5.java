public class Day04_2_5 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = 1.0 * sum / arr.length;
        System.out.println("10个学生的平均成绩为:" + avg);
    }
}
