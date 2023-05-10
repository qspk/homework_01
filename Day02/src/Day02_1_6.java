public class Day02_1_6 {
    public static void main(String[] args) {
        double dad = 177;
        double mom = 165;
        double son = (dad + mom) * 1.08 / 2;
        double dau = (dad * 0.923 + mom) / 2;
        System.out.println("儿子预计身高:"+son); //184.68
        System.out.println("女儿预计身高:"+dau); //164.1855
    }
}
