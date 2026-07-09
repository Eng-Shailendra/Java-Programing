package abstraction04;

public class Car extends Vehicle {

    Car(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " " + "Engin is started");
    }
}
