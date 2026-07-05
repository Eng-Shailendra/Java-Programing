package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        System.out.println(l.size());

        l.add("Ram"); // to add the data at list
        l.add("Raj");
        l.add(2, "Suraj"); // add to specific index

        l2.add("Vikash");
        l2.add("Mohit");
        l2.add("Rajat");

        l.addAll(l2);
        l.addAll(1, l2);

        // l.clear(); // Delete all element from list
        l.remove("Rajat"); // delete first accurence
        l.remove(5);
        // l.removeAll(l2);

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("Mohit"));
        System.out.println(l.containsAll(l2));
        System.out.println(l.indexOf("Suraj"));
        System.out.println(l.lastIndexOf("Mohit")); // if any Element has duplicate the has to give the last index

        // System.out.println(l.sort());
        System.out.println(l.toArray());

        System.out.println(l);

    }

}
