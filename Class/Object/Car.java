
public class Car {
    String name;
    int hp;
    int price;

    public Car(String name, int hp, int price) {
        this.name = name;
        this.hp = hp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + "Name : " + this.name + "HP : " + this.hp + "Price : " + this.price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        if (this == obj) {
            return true;
        }
        Car c = (Car) obj;
        return this.name.equalsIgnoreCase(c.name) && this.hp == c.hp && this.price == c.price;

    }

    // @Override
    // public int hashCode() {
    // Object o = new Object();
    // return o.hashCode();
    // }

}