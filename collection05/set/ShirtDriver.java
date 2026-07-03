package set;

import java.util.HashSet;
import java.util.Set;

public class ShirtDriver {
    public static void main(String[] args) {
        Set<Shirt> s = new HashSet<>();

        Shirt s1 = new Shirt("casual Shirt", "Peeter England", 4000, 40);
        Shirt s2 = new Shirt("Check Shirt", "Arrow", 2500, 37);
        Shirt s3 = new Shirt("Plane Shirt", "Arrow", 2500, 30);
        Shirt s4 = new Shirt("Fit Shirt", "Arrow", 2900, 35);
        Shirt s5 = new Shirt("Half Shirt", "Nike", 2500, 30);
        Shirt s6 = new Shirt("Check Shirt", "Arrow", 3000, 40);
        Shirt s7 = new Shirt("Casula Shirt", "Black Barry", 3500, 38);
        Shirt s8 = new Shirt("palne Shirt", "Arrow", 2700, 38);
        Shirt s9 = new Shirt("Fit Shirt", "Arrow", 3000, 37);
        Shirt s10 = new Shirt("Check Shirt", "Arrow", 2900, 40);

        s.add(s1);
        s.add(s4);
        s.add(s3);
        s.add(s10);
        s.add(s5);
        s.add(s9);
        s.add(s7);
        s.add(s8);
        s.add(s6);
        s.add(s2);
        s.add(s10);

        System.out.println("This is set of Shirt " + s.toString());

    }
}
