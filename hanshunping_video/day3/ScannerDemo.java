import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = myScanner.next();

        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();

        System.out.println("请输入身高：");
        float height = myScanner.nextFloat();

        System.out.println("请输入体重：");
        double weight = myScanner.nextDouble();


        System.out.println("个人信息为：\r\n姓名:" +name + "\r\n" + 
                        "年龄：" + age + "\r\n" + "身高：" + height + 
                        "\r\n" + "体重：" + weight);
    }
}