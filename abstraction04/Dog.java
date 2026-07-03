package abstraction04;

public class Dog extends Animal {
    // String name;

    public Dog(String name) {
        super(name);
        // this.name = name;
    }

    @Override
    void sound() {
        System.out.println("This is dog sound");
    }

    @Override
    public void eat() {
        System.out.println(bread + " is eating");
    }
}
