package String_In_Java;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ANKIT";
		String b = "rahul";
		
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		
		String c = "     Ankush   ";
		String d = "Learn";
		String e = "    ";
		System.out.println(c.trim());
		System.out.println(e.isEmpty());//false
		System.out.println(e.isBlank());//true
		
		System.out.println(b.charAt(2));
		System.out.println(a.indexOf("K"));
		
		System.out.println(b.equals(a));
		System.out.println(d.replace("r", "e"));
	}

}
