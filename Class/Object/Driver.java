
public class Driver {
    public static void main(String[] args) {
        String s1 = "abcd";
        Integer n1 = 2312;
        System.out.println("==============To string() ===========");
        Car c1 = new Car("Tata", 232, 436362);
        Car c2 = new Car("Suzki", 332, 236362);
        Car c3 = new Car("Hundey", 765, 876655);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("=======getClass========");
        System.out.println(c1.getClass());
        Object o = new Object();
        System.out.println(o);
        System.out.println(o.getClass().getMethods());
        System.out.println(o.getClass().getMethods().length);
        System.out.println(s1.getClass());
        System.out.println(n1.getClass());

        System.out.println("=======.equal()========");
        Car c4 = c2;
        System.out.println(c4 == c2); // true because it compaire the only object reference
        // ? .equle method is compare the intrnal details of two object. it is mendatory
        // to override
        System.out.println(c1.equals(c2)); // op - false  when not override the method  because it only compare the referance 
        
    }
}
