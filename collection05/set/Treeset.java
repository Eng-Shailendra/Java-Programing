package set;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

    // ! it is a class of tree that implenemt set interface.
    // it store the elemnet in sorted order
    // all element be same type;
    // null element can't added int treeset
    // 
    public static void main(String[] args) {
        Set<Number> s = new TreeSet<>();
        s.add(20);
        s.add(30);
        s.add(10);
        s.add(30);
        s.add(49);

        System.out.println(s);

        Set<Number> s1 = new TreeSet<>();
        s1.add(87);
        s1.add(57);
        s1.add(65);
        s1.add(33);
        s1.add(76);

        System.out.println(s.addAll(s1));

        System.out.println(s);

    }

}