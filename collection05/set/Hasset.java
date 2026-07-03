
import java.util.HashSet;

public class Hasset {

    // ! hash set is class which implement set interface
    // 1 hash set does not mentend insertion oreder;
    // 2 hash set can strore only one null element
    // 3 hash set has all elemnet are unique
    // 4 hash set not allow to store duplicate value

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();

        System.out.println(h.size());

        h.add("Suraj");
        h.add("Ansh");
        h.add("Raj");
        h.add("Rahul");

        HashSet<String> h1 = new HashSet<>();

        h1.add("Suraj");
        h1.add("Ansh");
        h1.add("Raj");
        h1.add("Rahul");

        // String[] arr = new String[] { "Raj", "Rahul" };

        System.out.println(h);
        System.out.println(h.contains("Suraj"));
        System.out.println(h.hashCode());
        System.out.println(h.clone());
        System.out.println("========");
        System.out.println(h.containsAll(h1));
        System.out.println("========");
        // System.out.println(h.equals(arr)); // !geting error because arry of not
        // beused
        System.out.println(h1); // ? is use to show the the collection of data

        System.out.println(h.getClass());

    }

}
