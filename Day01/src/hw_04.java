public class hw_04 {
    public static void main(String[] args) {
        byte b1 = -128;
        byte b2 = 127;

        short s1 = 32767;
        short s2 = -32768;

        int i1 = 2147483647;
        int i2 = -2147483648;

        long l1 = 2147483648L;
        long l2 = -2147483649L;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
//        System.out.println(pow(2,63));

       /* double x = Math.pow(2, 15);
        s1 = (short) Math.pow(2, 16);
        int y=1;
        for (int i = 0; i < 15; i++) {
            y *= 2;
        }
        System.out.println(s1);
        System.out.println(x);
        System.out.println(y);*/
    }
}
