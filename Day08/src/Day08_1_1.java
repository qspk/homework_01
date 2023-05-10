import java.util.Random;

public class Day08_1_1 {
    public static void main(String[] args) {
        String s = "令狐冲,风清扬,左冷禅,岳不群,苗人凤";
        String[] names = s.split(",");

        printNameList(names);
        callTheRoll(names);
    }

    public static void printNameList(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
            if (i % 2 == 1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void callTheRoll(String[] names) {
        Random r = new Random();
        int index = r.nextInt(names.length);
        System.out.println("本次被选中的幸运同学是:" + names[index]);
    }
}
