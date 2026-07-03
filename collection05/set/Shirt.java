package set;

public class Shirt {
    int Price, Size;
    String Name, Brand;

    Shirt(String Name, String Brand, int Price, int Size) {
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.Size = Price;
    }

    @Override
    public String toString() {
        return "name : " + this.Name + "brand : " + this.Brand + "price : " + this.Price + "size : " + this.Size;
    }

    

}
