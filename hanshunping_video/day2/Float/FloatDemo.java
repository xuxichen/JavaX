public class FloatDemo {
    public static void main(String[] args) {
        //   浮点数都有精度问题
            // 科学计数法
        System.out.println(5.12E2);  //512.0
        System.out.println(5.12E-2);//0.0512

        double numb1 = 2.122213231232;
        float numb2  = 2.122213231232F;

        System.out.println(numb1);
        System.out.println(numb2);

        double numb3 = 2.7;
        double numb4 = 8.1 / 3;

        System.out.println(numb3);
        System.out.println(numb4);

        if (numb3 == numb4) {
            System.out.println("numb3 等于 numb4");
        } else {
            System.out.println("numb3 不等于 numb4");
        }

        // 正确的写法
        if (Math.abs(numb3 - numb4) < 0.000001) {
            // 他们是相等的
            System.out.println("在我规定的精度范围内，numb3 等于 numb4");
        }
    }
}