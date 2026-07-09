package abstraction04;

public class Bus extends Vehicle {

    Bus(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + "Engin is startd with key");
    }
}
