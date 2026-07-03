package Class.ExceptionByMaim.Program3;

public class User {
    String name;
    int id, age, phoneNo;
    double sallary;

    User() {

    }

    User(String name, int id, int age, double sallary, int phoneNo) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNo = phoneNo;
        this.sallary = sallary;
    }

    public String toString() {
        return "[" + "Name : " + name + " Id : " + id + " age : " + age + " phoneNo : " + phoneNo + " Sallary : "
                + sallary + "]";
    }
}
