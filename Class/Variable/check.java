
public class check {
    int a;
    static int b;
    static String name; // share among all object
    boolean bo;
    static boolean bo1;
    double d;

    public static void main(String[] args) {
        // System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        // System.out.println(bo);// non static can't access var indise static method;
        System.out.println(bo1);
        System.out.println("==========demo=============");
        check c = new check();
        c.demo();
        demo2();
    }

    public static void demo2() {
    }

    public void demo() {
        String color;
        System.out.println(name);
        System.out.println(b);
        System.out.println(bo);
        System.out.println(bo1); // static varibel can accessed all the object of class;
        System.out.println(d);
        System.out.println("=====================local variables===============");
        // System.out.println(color);

    }
}
