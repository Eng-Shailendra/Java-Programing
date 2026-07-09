package abstraction04;

public class Cat extends Animal {

    Cat(String name, String bread) {
        super(name, bread);
    }

    @Override
    void sound() {
        System.out.println(name + " is mumming like mew...mew...mew...!!!!!! ");
    }

}
