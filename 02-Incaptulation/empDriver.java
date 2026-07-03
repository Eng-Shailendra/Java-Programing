import java.util.Scanner;

public class empDriver {
    public static void main(String[] args) {
        employ e1 = new employ();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice if want to add employ enter yes/no");
        // String chInput = sc.nextLine();

        // if (chInput.equalsIgnoreCase("yes")) {
        // do {
        // System.out.println("Enter name : ");
        // e1.setter(sc.nextLine());
        // System.out.println("Enter id : ");
        // e1.setter(sc.nextInt());
        // System.out.println("Enter Salary : ");
        // e1.setter(sc.nextDouble());
        // System.out.print("Enter your choice if you want to add more employ :
        // Yes/No");
        // chInput = sc.nextLine();

        // } while (chInput.equalsIgnoreCase("yes"));

        System.out.print(e1.getter());
        sc.close();
    }

}
