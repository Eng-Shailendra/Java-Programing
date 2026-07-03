package InterviewQuestion.opp;

public class check {
    int a;
    static int b;
    static String name;

    public static void main(String[] args) {
        // System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        System.out.println("==========demo=============");
        check c = new check();
        c.demo();
    }

    public void demo() {
        System.out.println(name);
        System.out.println(b);
    }
}
