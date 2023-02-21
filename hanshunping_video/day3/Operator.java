public class Operator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 46;
        int b = 0;
        if ((z++==46) && (y=true)) z++;
        System.out.println(z);
        // if (b=0) { //错误: 不兼容的类型: int无法转换为boolean
        if (x=false) { // 赋值为true 判断条件为true 赋值为false判断条件为false
            System.out.println("赋值语句赋值false 判断条件是真");
        } else {
            System.out.println("赋值语句赋值false 判断条件是假");
        }

        if((x=false) || (++z == 49)) z++;
        System.out.println(z);
    }
}