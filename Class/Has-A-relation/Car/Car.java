package Car;

import javax.print.DocFlavor.STRING;

class Car extends Engine {

    private String brand, color ;
    private int strock;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setStrock(int strock) {
        this.strock = strock;
    }
    public String getBrand() {
       return brand;
    }
    public String getColor() {
        return color;
    }
    public int getStrock() {
        return strock;
    }
    
}