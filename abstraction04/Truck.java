package abstraction04;

public class Truck extends Vehicle {

    Truck(String name) {
        super(name);
    }

    @Override
    void startEngine(){
        System.out.println(name + " "+ "Engine is started ");
    }
}
