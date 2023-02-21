public class ArithmeticOperator {
    public static void main(String[] args) {
        // 取余（取模）
        // 取余公式 a % b = a - a / b * b
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        // 10 - 10 / -3 * -3 => 10 - -3 * -3 = 10-9 
        System.out.println(10 % -3); 
        System.out.println(-10 % -3); 
        // 取余时，当a为浮点数时，a % b = a - （int）a / b * b
        System.out.println(-10.5 % 3);
        //没看明白
        // System.out.println(-10.5 % 4.2);

        // 实际的运算规则 (我觉得这种解释不对)
        /**
            1、temp = i；
            2、i = i + 1； 这一步就是i 的后自增
            3、i = tem
            例如： 
                int a = 1；
                int b = 2；
                a = b； // temp = a；a = b; 

--------我觉得这种解释合理，但没有内存图来解释，我暂时也理解不是和清楚-------------
            所以i=i++在计算机中是这样分析的：
           
            1）计算i++表达是的值

            2）将i加1

            3）将表达式的值赋予i

            https://zhuanlan.zhihu.com/p/397927425 
            这篇知乎从汇编角度来解释了但我还是看不懂
            但可以先记住这一句话
            《c++ primer》上看见这样的解释：
            “++i的效率要比i++的效率高，因为i++必须要有一个临时变量来存放i本身的值“
            可以知道韩老师讲这一节的时候是讲错了的
         */
        int i = 1;
        i = i++;
        System.out.println("i++ == " + i); // 1

        // 实际的运算规则
        /**
            1、j = j + 1； 这一步就是j 的前自增
            2、j = j
         */
        int j = 1;
        j = ++j;
        System.out.println("++j == " + j); // 2
        
        int k=66;
        System.out.println(++k+k);
    }
}