// import java.util.Scanner;

public class laptopdriver {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the 1 if you want save data 1 if not enter 0 ");
        // int choice = sc.nextInt();

        // do {
        // if (choice != 1)
        // return;

        // System.out.println("Enter the brand Name : ");
        // String brand = sc.nextLine();
        // System.out.println("Enter the model : ");
        // String model = sc.nextLine();
        // System.out.println("Enter the brand Ram : ");
        // int ram = sc.nextInt();
        // System.out.println("Enter the brand Price : ");
        // double price = sc.nextDouble();
        // laptop l2 = new laptop(brand, model, ram, price);

        // } while (choice >= 1);

        // sc.close();

        laptop l1 = new laptop("HP", "hp2020", 8, 23443);
        l1.toString();
    }
}
