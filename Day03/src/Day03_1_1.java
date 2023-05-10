public class Day03_1_1 {
    public static void main(String[] args) {
        int studentNum = 60;
        int treeNun = 0;
        for (int i = 1; i <= 20; i++) {
            treeNun += i;
        }
        treeNun *= studentNum;
        System.out.println("种了"+treeNun+"颗树");//12600
    }
}
