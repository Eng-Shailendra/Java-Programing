public class user {
    public static void main(String[] args) {
        Engine e = new Engine("s29", 12, 2342);
        Car c = new Car("Safari", "S29", "blue", e);

        System.out.println(c.toString());
    }
}
