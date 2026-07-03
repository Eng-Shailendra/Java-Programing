import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Service {

    public String nameValidator(String name) {
        boolean isValid = false;
        while (!isValid) {
            if (name.matches("^[a-zA-Z]+$")){
                isValid = true;
            } else {
                System.out.println("Invalid Input");
            }
        }
        return name;
    }
    public int inputNumber() throws IllegalStateException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c >= '1' && c <= '9') {
                flag = true;
            }
            flag = false;
        }
        if (flag) {
            return Integer.parseInt(num);
        } else {
            throw new IllegalStateException("Enter the Valid  No : ");
        }

    }

    public double InputDouble() throws IllegalStateException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c >= '1' && c <= '9' || c == '.') {
                flag = true;
            }
        }
        if (flag) {
            return Double.parseDouble(num);
        } else {
            throw new IllegalStateException("Enter the Valid No : ");
        }

    }

    public int addaccount() {
        int accountno = (int) (Math.random() * 100000);
        System.out.println("Your Account No is: " + accountno);
        return accountno;
    }

    public int createPin() {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        System.out.println("Your Pin is: " + pin);
        return pin;
    }

    public void accountDetails(String name, int age, double amount, int accountno) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Amount: " + amount);
        System.out.println("Account No: " + accountno);
    }

    public void newAccount() {
        List<Bank> BankUser = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = nameValidator(sc.nextLine());
        System.out.println("Enter Your Age: ");
        int age = Integer.parseInt(sc.nextLine().isDigit());
        System.out.println("Enter Your Amount: ");
        double amount = Double.parseDouble(sc.nextLine());
        int accountno = addaccount();
        boolean isValid = checkDetails(name, age, amount, accountno);
        if (isValid) {
            CreatAccount creatAccount = new CreatAccount(name, age, amount, accountno);
            accountDetails(name, age, amount, accountno);
            BankUser.add(creatAccount);
        }
    }

    public boolean checkDetails(String name, int age, double amount, int accountno) {
        if (age < 18) {
            System.out.println("You are not eligible to create an account");
            return false;
        } else if (amount < 5000) {
            System.out.println("Minimum amount to create an account is 5000");
            return false;
        } else {
            accountDetails(name, age, amount, accountno);
            return true;
        }
    }

}
