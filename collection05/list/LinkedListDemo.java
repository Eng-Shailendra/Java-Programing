package list;

import java.util.LinkedList;
// import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(20);
        l.add(300);
        l.add(4000);

        l.toArray();
        l.add(10);
        l.add(2, 30);
        l.addAll(l);

        l.remove(4);
        // int val = 4000;
        // l.remove(val);
        l.offer(2);

        System.out.println(l);

    }
}
