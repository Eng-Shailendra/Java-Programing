package Product;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'YES' for start app");
        String choice = sc.nextLine();
        service s = new service();

        do {
            int toRun = s.menu(); // call from menu and it return a integer;
            switch (toRun) {
                case 1:
                    s.addShirtDetails();
                    break;
                case 2:
                    s.accessAllShirtDetails();
                    break;
                case 3:
                    s.accessShirtDetailsByBrand();
                    break;
                case 4:
                    s.accessShirtDetailsByPriceRange();
                    break;
                case 5:
                    s.accessShirtDetailsBySize();
                    break;

                case 6:
                    s.accessShirtDetailsBySizeAndPriceRange();
                    break;
                case 7:
                    s.sortShirtsBySize();
                    break;
                case 0:
                    System.out.println("Thank you  for using shirt project! Application Exiting... ");
                    break;
                default:
                    System.out.println("Invalid choice, please try again ");

            }

        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Application closed.");
        sc.close();
    }

}
