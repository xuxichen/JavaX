/**
    char 的本质是一个整数，输出的时候是对应的unicode码对应的字符
 */
public class CharDetail {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '徐';
        char c4 = 67;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)c1);

        System.out.println('a'+10);
    }
}