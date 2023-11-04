package String_In_Java;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "I am Pramod Sitaprao";
		String reversed = "";
		
		for(int i= name.length()-1; i>=0; i--) {
			
			reversed += name.charAt(i);
		}
		System.out.println("Original String: "+name);
		System.out.println("Reversed String: "+ reversed);
	}

}
