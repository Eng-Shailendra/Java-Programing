import java.util.Scanner;

import Class.ExceptionByMaim.BankProgram.Bank;

public class User {

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println("Welcome to the Bank");
        System.out.println("Press 'Yes' to continue: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        do {
            System.out.println("Press 1 to Create Your Account: ");
            System.out.println("Press 2 to Create Your Pin: ");
            System.out.println("Press 0 to Exit: ");
            switch (choice) {
                case "1":
                    service.newAccount();
                    break;
                case "2":
                    service.createPin();
                    break;
                case "0":
                    System.out.println("Thank You for Visiting the Bank");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("Do you want to continue? Press 'Yes' to continue: ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

    }

    
}
