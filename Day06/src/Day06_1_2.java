public class Day06_1_2 {
    public static void main(String[] args) {
        int integral = 1000;
        double money = 500.0;
        double consumption = 80.0;
        payment(consumption, integral);
        payment(consumption, money);
        payment(consumption, integral, money);
    }
    //积分支付
    public static void payment(double consumption, int integral) {
        if (consumption * 10 > integral) {
            System.out.println("积分余额不足,请更换支付方式");
            return;
        }
        System.out.println("积分支付-付款成功");
        System.out.println("本次支付扣除积分" + (consumption * 10)
                + ",账户剩余积分:" + (integral - consumption * 10));
    }
    //现金支付
    public static void payment(double consumption, double money) {
        if (consumption > money) {
            System.out.println("现金不足,请更换支付方式");
            return;
        }
        System.out.println("现金支付-付款成功");
        System.out.println("本次消费" + consumption + "元,收您:" + money
                + "元,找零:" + (money - consumption) + "元");
    }
    //混合支付
    public static void payment(double consumption, int integral, double money) {
        if (500 > integral || consumption - 50 > money) {
            System.out.println("积分余额或现金不足,请更换支付方式");
            return;
        }
        System.out.println("积分现金混合支付-付款成功");
        System.out.println("本次支付扣除积分500" + ",账户剩余积分:" + (integral - 500)
                + "本次支付实际扣款" + (consumption - 50) + "元"
                + "您的账户现金:" + (money - consumption + 50) + "元");
    }

}
