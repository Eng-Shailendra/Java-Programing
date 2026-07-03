package Class.ExceptionByMaim.BankProgram;

public class Bank {
    String name;
    int pin, accountno, age, id;
    double amount;

    Bank() {
    }

    protected Bank(String name, int age, double amount, int accountno) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.accountno = accountno;
    }

    Bank(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAmount: " + amount + "\nAccount No: " + accountno;
    }

}
