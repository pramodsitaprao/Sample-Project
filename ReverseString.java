package String_In_Java;

public class ReverseString {

	public static void main(String[] args) {
		// For checking git code updation on gitHub
//		StringBuffer s1= new StringBuffer("Hello Pramod");
//		System.out.println(s1.reverse());
//		
//		StringBuilder s2= new StringBuilder("Java Coding");
//		System.out.println(s2.reverse());
		
		String s3= "This is String";
		String s4 = "";
		int l= s3.length();
		
//		for(int i=l-1; i>=0; i--) {
//			s4=s4+ s3.charAt(i) ;
//		}
//		System.out.println(s4);
	
	
	for(int i=0; i<l; i++) {
		s4= s3.charAt(i) + s4;
	}
	System.out.println(s4);
}

}
