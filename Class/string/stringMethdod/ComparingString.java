package string.stringMethdod;

public class ComparingString {
    // In order
    // to compare Strings for equality,
    // you should
    // use the String object's
    // equals or
    // equalsIgnoreCase methods

    public static void main(String[] args) {
        String firstStr = "text123";
        String secondString = "text" + 123;

        if (firstStr.equals(secondString)) {
            System.out.println("Both String have same content");
        } else
            System.out.println("Not have same content");

        System.out.println("=======equalsIgnoreCase=============");

        if (firstStr.equalsIgnoreCase(secondString)) {
            System.out.println("Both String have same content");
        } else
            System.out.println("Not have same content");

    }
}
