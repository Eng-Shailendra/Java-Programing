public class FindCharSequence {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello";
        String Str3 = "helLo";

        // index of method returns thefirst index of a char or String in another String
        // the method returns -1 if it is not found.
        // case sensitive;
        System.out.println(str1.contains(str2)); // true;

        System.out.println(str1.contains(Str3)); // false;

        System.out.println("=============Index Of =============");
        String s = "This is a long sentence";
        System.out.println(s.indexOf("i"));
        System.out.println(s.indexOf("long"));
        System.out.println(s.indexOf("long sen"));
        System.out.println(s.indexOf("z"));
    }
}
