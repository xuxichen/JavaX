public class MoreVarTypeCal {
    public static void main(String[] args) {
        char c1= 76;
        byte b1 = 32;
        short s1 = 67;

        char c2 = 30;
        char c3 = c1 + c2; // 用char接受也是错误，也会提升为整型

        byte b2 = 45;
        int b3 = b1 + b2; 

        short s2 = 61;
        int s3 = s1 +s2; // 用short接受也是错误，也会提升为整型

        
        // byte 可以转成 short  但和 char不能互转，short也不能喝char互转
        //自动提升为整型
        System.out.println(c1 + b1 + s1);
    }
}