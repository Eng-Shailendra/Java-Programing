package abstraction04;

abstract class Animal {

    // ! Abstraction -- it is a feature of opp's, it use to hide the implementaion
    // details and showing only functionality to user
    // Abstract class can't create object
    // abstraction has constructor
    // it has regular variabel
    // it has abstract method and aslo have concrete mehtod
    //

    String name;
    String bread;

    public Animal(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    abstract void sound();

    public void eat() {
        System.out.println(name + " Animal is eating ");
    }

}
