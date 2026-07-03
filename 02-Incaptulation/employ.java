public class employ {
    private String name;
    private int id;
    private double salary;

    public void setter(String name) {
        this.name = name;
    }

    public void setter(int id) {
        this.id = id;
    }

    public void setter(double salary) {
        this.salary = salary;
    }

    public String getter() {
        return ("ID : " + id + "\n" + "name: " + name + "\n" + "Salary: " + salary);
    }
}
