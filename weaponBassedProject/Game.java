import java.util.Scanner;

public class Game {
    public Weapon selectWeapon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("select a weapon");
        System.out.println("1, Gun");
        System.out.println("2, knife");
        System.out.println("3, Bomb");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("knife Selected ");
                knife k = new knife();
                return k;
            case 2:
                Gun G = new Gun();
                System.out.println("Gun Selected ");
                return G;
            case 3:
                Bomb B = new Bomb();
                System.out.println("Bomb Selected ");
                return B;
            default:
                System.out.println("default");
        }
    }

}
