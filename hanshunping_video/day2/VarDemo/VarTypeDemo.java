public class VarTypeDemo {
    public static void main(String[] args) {

        // 基本数据类型
            // 整型
        byte b= 90; // 1个字节 范围：-128～127
        short s = 47; // 2个字节 范围：-2^15～2^15-1  (-32768～32767)
        int age= 30;  // 4个字节 范围： -2^31～2^31-1 (-2147483648～2147483647)
        long money = 95246723L; // 8个字节 范围： -2^63～2^63-1

            // 浮点类型 默认double
            // 浮点数在机器中存放的星际说明： 浮点数 = 符号位 + 指数位 + 尾数位
            // 尾数部分可能丢失，造成精度损失（小数都是近似值）
        double score = 93.5; // 8个字节 范围：-1.798E308～1.798E308 
        float weigth = 87.7f; // 4个字节  范围：-3.403E38  ～ 3.403E38
        char gender = '男'; // 2个字节
        Boolean isMarry = false; // 1个字节

        // 引用类型 
        String name = "徐余"; // 4个字节

        System.out.println("年龄："+age+"\r\n"+"分数："+score+"\r\n"+"体重："+weigth+"\r\n"
                            +"性别："+gender+"\r\n"+"名字："+name+"\r\n" + "是否结婚："+isMarry);
    }
}