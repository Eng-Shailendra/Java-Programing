public class ComparingString4 {
    public static void main(String[] args) {
        String strobj = new String("Hello!");
        String str = "Hello!";
        String str2 = "Hello!";

        System.out.println(strobj.equals(str)); // ture;
        System.out.println(strobj == str); // false because it not refere same obj;
        System.out.println(str == str2); // true (refering same object )
    }
}
