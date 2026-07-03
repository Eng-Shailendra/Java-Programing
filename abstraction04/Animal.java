package abstraction04;

public abstract class Animal {

    // ! Abstraction -- it is a feature of opp's, it use to hide the implementaion
    // details and showing only functionality to user

    // abstraction has constructor
    // it has regular variabel
    // it has abstract method and aslo have concrete mehtod
    //

    public String name;
    protected String bread = "german";

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void eat() {
        System.out.println("Animal eating");
    }

}
