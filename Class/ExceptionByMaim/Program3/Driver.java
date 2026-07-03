package Class.ExceptionByMaim.Program3;

import java.util.Scanner;

public class Driver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        User[] ul = new User[3];

        User u1 = new User("Raj", 1, 22, 50000, 123890);
        User u2 = new User(null, 2, 22, 58893, 0);
        User u3 = new User("Ravi", 3, 22, 32493, 873456);

        ul[0] = u1;
        ul[1] = u2;
        ul[2] = u3;

        countDatatype(ul);

    }

    public static void countDatatype(User[] ul) {
        int countInt = 0, countString = 0, countDouble = 0;
        for (User u : ul) {
            if (u.id != 0)
                countInt++;
            if (u.name != null)
                countString++;
            if (u.sallary != 0.0)
                countDouble++;
            if (u.phoneNo != 0) {
                countInt++;
            }
        }
        System.out.println("Count of Integer : " + countInt);
        System.out.println("Count of String : " + countString);
        System.out.println("Count of Double : " + countDouble);

    }

    // public static void main(String[] args) {

    // System.out.println("Enter 'yes' to start");
    // String choice = sc.nextLine();
    // if (choice.equalsIgnoreCase("yes")) {
    // System.out.println("enter the target no that you want to add user");
    // int target = Integer.parseInt(sc.nextLine());
    // listingUser(target);
    // } else {
    // System.out.println("Please try next time.......! " + (char) 10084);
    // }
    // }

    public static void listingUser(int target) {
        User[] uList = new User[target];
        int start = 0;
        while (start < target) {
            uList[start++] = inputUser();
        }
    }

    public static User inputUser() {
        // Enter details here;
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Enter the age : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Sallary : ");
        double sallary = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the phoneNo : ");
        int phoneNo = Integer.parseInt(sc.nextLine());
        User u = new User(name, id, age, sallary, phoneNo);
        // list of user is
        return u;
    }

}
