package InterviewQuestion.opp;

public class Vechicle {
    String brand;
    String color;
    double price;

    Vechicle(String brand, String color, int price) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" + brand + " " + price + " " + color + "]";
    }
}
