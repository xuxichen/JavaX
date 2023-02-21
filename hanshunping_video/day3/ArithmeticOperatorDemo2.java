public class ArithmeticOperatorDemo2 {
    public static void main(String[] args) {
        // 华氏温度转摄氏温度
        
        System.out.println("华氏234.5度为摄氏温度" + huashiTosheshi(234.5) + "度");
    }
    public static double huashiTosheshi(double h) {
        return 5.0 / 9 * (h - 100);
    }
}