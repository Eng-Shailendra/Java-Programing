package string.stringMethdod;

public class ComparingString {
    // In order
    // to compare Strings for equality,
    // you should
    // use the String object's
    // equals or
    // equalsIgnoreCase methods
    static String str5;

    public static void main(String[] args) {
        String firstStr = "text123";
        String secondString = "TEXT" + 123;

        String str3;
        String str4;

        // System.out.println(firstStr.equals(str3));
        // System.out.println(str3.equals(str3));
        // System.out.println(str3.equals(firstStr));
        // //? all three are getting compilation error;

        // System.out.println("avc".equals(str3));
        // System.out.println(str4); //? getting error
        System.out.println(str5); // null
        System.out.println(firstStr.equals(str5)); // false
        // System.out.println(str5.equals(firstStr));//? getting nullpointer Exception

    }
}
