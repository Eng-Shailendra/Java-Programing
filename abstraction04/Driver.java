package abstraction04;

public class Driver {

    public static void main(String[] args) {
        Dog d = new Dog("Durgesh", "Deshi");
        d.sound();

        Cat cat = new Cat("Roohi", "GERMAN");
        cat.sound();
        // d.eat();
        // // System.out.println(dog.name);
        // // System.out.println(d.name);
        // // System.out.println(dog.bread);
        // // System.out.println(d.bread);
        System.out.println("=================================");
        // ! abstract class is vehicle
        Bus b = new Bus("Volvo");
        b.displayName();
        b.startEngine();
        Car c = new Car("Maruti");
        c.startEngine();
        c.displayName();
        Truck t = new Truck("Tata");
        t.displayName();
        t.startEngine();

    }
}
