public class User {
    public static void main(String[] args) {
        System.out.println("Press 1 for new game");
        System.out.println("Press 2 for exit");
        int choice = new Scanner(System.in).nextInt();

        switch (choice) {
            case 1:
                Game g = new Game();
                Weapon w = g.selectWeapon(); // upcasting
                system.out.println(w.getClass().getName());
                // w.use();
                break;
            case 2:
                System.out.println("Exit");
                break;
            default:
                System.out.println("default");
        }

    }

}
