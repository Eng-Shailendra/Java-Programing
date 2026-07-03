public class Engine {
    String model;
    int stock;
    int price;

    // Engine() {

    // }

    public Engine(String model, int stock, int price) {
        this.model = model;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + "\tModel : " + model + "\tStock : " + stock + "\tprice" + price + "]";
    }

}
