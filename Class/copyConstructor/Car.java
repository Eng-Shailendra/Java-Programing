public class Car {
    String brand;
    String model, color;
    Engine engine;

    Car() {
        super();
    }

    public Car(String brand, String model, String color, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + "\tModel : " + model + "\tColor : " + color + "\tEngine : " + engine;
    }
}
