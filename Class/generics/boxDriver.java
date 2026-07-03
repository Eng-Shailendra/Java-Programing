package generics;

import java.lang.reflect.Type;

public class boxDriver {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("tata");
        Box<Integer> b2 = new Box<>(21);
        Box<Double> b3 = new Box<>(322.8);

        System.out.println(b1.getvalue());
        System.out.println(b2.getvalue());
        System.out.println(b3.getvalue());

        System.out.println(b2.toString());
        System.out.println(b3.hashCode());
        System.out.println(b3.getClass());

    }
}
