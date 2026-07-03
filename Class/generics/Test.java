package generics;

import java.util.ArrayList;
import java.util.List;

//! unbounded  type 
public class Test {
    public static void main(String[] args) {
        clean("Surj", 323);
        clean(8773, "suraj");

        System.out.println("========== UNBOUND list =========");

        List<String> strlist = new ArrayList<>();
        strlist.add("Suaj");
        demo(strlist);

        List<Cat> catlist = new ArrayList<>();
        catlist.add(new Cat());
        demo(catlist);

        // bounded method with animal class so
        demo1(catlist); // cat extends Amimal
        // demo1(strlist); // cant be call

        // lowerbounded
        System.out.println("=======Lower bounded ===============");
        // demo3(strlist);
        demo(catlist);
        List<Dog> doglist = new ArrayList<>();
        doglist.add(new Dog());
        demo(doglist);

    }

    public static <T, V> void clean(T text, V AnotherText) {
        System.out.println("this is nubounded type text : " + text + " " + AnotherText);
    }

    // ! unbounded class
    public static void demo(List<?> l) {
        System.out.println(l);
    }

    // ! bounded class
    public static void demo1(List<? extends Animal> l) {
        System.out.println(l);
    }

    // ! Lowerr Bounded class
    public static void demo3(List<? super Animal> l) {
        System.out.println(l);
    }
}
