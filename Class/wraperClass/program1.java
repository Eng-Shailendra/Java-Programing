package wraperClass;

public class program1 {
    public static void main(String[] args) {
        Integer x = 200; // ! auto boxing;
        System.out.println(x.byteValue());

        Integer a = 100;
        Integer b = a;
        Integer c = (a / 2) - b;
        System.out.println(c); // -50;

        Integer d = new Integer(100);
        System.out.println(d);
        System.out.println(a == d); // bcos the obj referance is deffernet the output will false;
        System.out.println(a == b); // bcos the object referance is same the output is true ;

        System.out.println("==========Unboxing============");
        Integer y = 100; // boxing
        int z = 103; // unboxing

        System.out.println("==========Un Parshing===========");
        double p = 855.988;
        String s1 = Double.toString(p);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println("========= convert a number ==========");
        String s2 = Double.toHexString(p);
        System.out.println(s2);
        Integer n = 323;
        String s3 = Integer.toBinaryString(z);
        System.out.println(s3);
        String s4 = Integer.toHexString(n);
        System.out.println(s4);
        String s5 = Integer.toOctalString(n);
        System.out.println(s5);
        String s6 = Integer.toUnsignedString(n);
        System.out.println(s6);
        String s7 = Integer.toString(n, 8);
        System.out.println(s7);

        System.out.println("=========convert formate ==========");
        String str1 = "988";
        int x1 = Integer.parseInt(str1);
        System.out.println(x1);
        String str2 = "Suraj";
        int x2 = Integer.parseInt(str2);
        System.out.println(x2);

    }
}
