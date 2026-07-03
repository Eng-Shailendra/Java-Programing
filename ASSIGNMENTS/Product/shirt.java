package Product;

public class shirt {
    String brand, color;
    double price;
    int size;

    shirt(String brand, String color, double price, int size) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Shirt [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
    }
}