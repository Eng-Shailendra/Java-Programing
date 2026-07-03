
public class Driver {
    int a = 10;

    public static void main(String[] args) {
        // ! ------Shadowing------------
        // Happens within the same class when a local variabel hides a class-level
        int a = 30; // ?
        System.out.println(a); // ? shadowing

        // ! --------Variabe hiddding----------
        // happen between parent and child class
        Parent p = new Parent();
        // System.out.println(p.s); // it is

        Parent p1 = new Child();
        // System.out.println(p1.s); // ! variable hidding

        // Child p2 = new Child();
        // System.out.println(p2.s);

        System.out.println(p.s);
        System.out.println(p1.s); // variable hidding accure whene save data in parent type reference

    }
}