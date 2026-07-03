import java.util.Scanner;

public class SpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        char[] a1 = s1.toCharArray();
        String c = sc.nextLine();
        char d = c.charAt(0);
        for (int i = 0; i <= s1.length(); i++) {
            if (a[i] == d) {
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                } else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                }
                a[i] = d;
                break;
            }
        }
        s1 = String.valueOf(a1);
        System.out.println(s1);

    }

   
}
