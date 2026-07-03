import java.util.Scanner;

public class InputMissMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int str = sc.nextInt(); // ? if user give any string or other data type value, we get exception at run
                                // time
        System.out.print(str);
    }
}
