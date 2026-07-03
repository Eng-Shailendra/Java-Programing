
class laptop {
    int ram;

    public static void main(String[] args) {
    }

    void setValue(int ram) {
        this.ram = ram;
    }

    void show() {
        System.out.println(ram);
    }
}

class Innerlaptop {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.setValue(8);
        l1.show();
    }

}