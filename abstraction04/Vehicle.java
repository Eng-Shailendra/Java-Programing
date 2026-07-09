package abstraction04;

abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract void startEngine();

    // Concrete method - Share Behavior, no need to override
    void displayName() {
        System.out.println("Vehicle : " + name);
    }

}
