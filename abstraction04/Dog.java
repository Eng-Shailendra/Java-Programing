package abstraction04;

public class Dog extends Animal {
    // String name;

    public Dog(String name, String bread) {
        super(name, bread);
        
    }

    @Override
    void sound() {
        System.out.println(name + " Dog  is barking on the road like Bhao...bhao...bhao....!!!!!!");
    }

}
