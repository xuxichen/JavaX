public class ArithmeticOperatorDemo1 {
    public static void main(String[] args) {
        // 假如还有59天放假，问：合几个星期零几天
        int dayNumb = 59;
        int weeks = 59 / 7;
        int days = 59 % 7;
        System.out.println("合" + weeks + "个星期零" + days  + "天");
    }
}