package string.stringMethdod;



public class ComparingString {
    
    public static void main(String[]args){
	String strObj = new String("hello!");
	String str = "Hello!";
	String str2 = new String("Hello!");

	// 
	System.out.println("--------using (.equals()) to compare ------");
	System.out.println(strObj.equals(str)); // 
	System.out.println("--------using (.equalsIgnoreCase()) to compare ------");
	System.out.println(strObj.equalsIgnoreCase(str)); // 
	System.out.println("--------using (==) to compare ------");
	System.out.println(strObj == (str));//

	System.out.println("=========================");

	System.out.println("--------using (.equals()) to compare ------");
	System.out.println(strObj.equals(str2)); // 
	System.out.println("--------using (.equalsIgnoreCase()) to compare ------");
	System.out.println(strObj.equalsIgnoreCase(str2)); // 
	System.out.println("--------using (==) to compare ------");
	System.out.println(strObj == (str2));//
	}
}
