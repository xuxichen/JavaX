public class VarDemo1 {
    public static void main(String[] args) {
        int a=90;
        System.out.println("a === " + a);
        int b=30;
        System.out.println("b === " + b);
        b = a;
        System.out.println("最终的a === " + a);
        System.out.println("最终的b === " + b);
    }
}