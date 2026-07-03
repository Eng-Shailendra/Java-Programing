package ExceptionByMaim.Program2;

import java.util.Scanner;
import javax.management.InvalidAttributeValueException;
import javax.naming.InvalidNameException;

public class Driver {
    public static void main(String[] args) {
        setData();
    }

    public static void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        String choice = sc.nextLine();

        do {
            try {
                System.out.print("Enter the name : ");
                String name = checkName(sc.nextLine());
                System.out.print("Enter the Id : ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the age : ");
                int age = checkAge();
                System.out.print("Enter the rollno : ");
                int rollno = Integer.parseInt(sc.nextLine());
                System.out.println("Do you want to add more Student enter 'yes' ");
                choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    System.out.println("Byeee!!!!!");
                    return;
                }
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }

        } while (choice.equalsIgnoreCase("yes"));

    }

    public static int checkAge() throws InvalidAttributeValueException {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        if (age > 10 && age < 100) {
            return age;
        } else
            throw new InvalidAttributeValueException("Enter the age between 10 to 100 ");
    }

    public static String checkName(String name) throws InvalidNameException {
        int start = 0;
        int n = name.length();
        boolean falg = false;
        while (start < n) {
            char c = name.charAt(start++);
            if ((c > 'a' && c < 'z') || (c > 'A' && c > 'B') || c == ' ') {
                falg = true;
            }
            falg = false;
        }
        if (falg) {
            return name;
        } else {
            throw new InvalidNameException("Enter the Correct Name ");
        }
    }
}
