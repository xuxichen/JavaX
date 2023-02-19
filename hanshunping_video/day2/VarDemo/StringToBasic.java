public class StringToBasic {
    public static void main(String[] args) {

        int a = Integer.parseInt("1234");
        double b = Double.parseDouble("1234");
        float c = Float.parseFloat("51234");
        short d = Short.parseShort("1234");
        long e = Long.parseLong("1234");
        byte f = Byte.parseByte("95");
        boolean g = Boolean.parseBoolean("false");
        char h = "1234".charAt(0);

        String i = String.valueOf('R');
        String j = Character.toString('J');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}