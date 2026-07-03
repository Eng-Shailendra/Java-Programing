package vendingMachineProject;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome sir ");
        System.out.println("Enter your choice 'Yes' to Continue ");

        String choice = sc.nextLine();

        Coffee c = new Coffee();
        Juice j = new Juice();
        Coke co = new Coke();
        Wine w = new Wine();

        do {
            System.out.println("Enter the Number");
            int n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1:
                    c.use();
                    break;
                case 2:
                    j.use();
                    break;
                case 3:
                    co.use();
                    break;
                case 4:
                    w.use();
                    break;
                case 0:
                    return;
                default:
                    System.out.println(" Enter the invalide inpute  ");
                    break;
            }

        } while (choice.equalsIgnoreCase("yes"));
        sc.close();
    }
}
