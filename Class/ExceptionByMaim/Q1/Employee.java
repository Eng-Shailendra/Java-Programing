package ExceptionByMaim.Q1;

public class Employee {
    int id, age;
    String name;
    double sallary;

    public Employee() {

    }

    public Employee(int id, String name, int age, double sallary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSallary() {
        return this.sallary;
    }

    public String toString() {
        return "[" + "Id : " + id + "\tName : " + name + "\tAge : " + age + "\tSallary" + sallary + "]";
    }
}
