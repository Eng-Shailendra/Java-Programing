package wraperClass;

public class Program2 {
    public static void main(String[] args) {
        Object o1 = "abcd";
        Object o2 = 212;
        Object o3 = 3.42;
        Object o4 = "@kfk$mf%";

        String s1 = (String) o1; // down casting is performed;
        System.out.println(s1);
        int s2 = (int) o2;
        System.out.println(s2);
        // Integer s3 = (Integer) o1; // !Exception --- class cast string can't be cast
        // to class java.lang.Integer;
        // int s4 = (int) o1;
        // System.out.println(s4); // ! class cast excepton;
        // System.out.println(s1 + " " + s2 + " " + s3 + " " );

        // Long l1 = (Long) o3; // ! class cast excepton;
        Double d1 = (Double) o3;
        System.out.println(d1);
        double d2 = (double) o3;
        System.out.println(d2);

    }
}
