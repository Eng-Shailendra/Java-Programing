package constructor;

public class Driver {
    public static void main(String[] args) {
        Student s = new Student("Suraj", 12, 15, 12);
        System.out.println(s);

        Student s1 = new Student("Rohit", 20, 883);
        System.out.println(s1);
    }
}
