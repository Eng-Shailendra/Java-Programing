package constructor;

public class Student {
    String name;
    int id, age;
    int year;

    Student() {

    }

    Student(String name, int id, int age, int year) {
        this(name, id, age);
        this.year = year;
    }

    Student(String name, int id, int age) {
        this(name, id);
        this.age = age;
    }

    Student(String name, int id) {
        this(name);
        this.id = id;
    }

    Student(String name) {
        this.name = name;
    }

    Student(int id) {
        this.id = id;
    }

    public String toString() {
        return name + " " + id + " " + age + " " + year;
    }

}
