package String_In_Java;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// take input from user
//		Scanner sc = new Scanner(System.in);
//		String fullName= sc.nextLine();
//		System.out.println("My fullname is: "+fullName);

		// Concatenation => +
//		String firstName = "Pramod";
//		String lastName = "Sitaprao";
//		String fullName = firstName + "@" + lastName;
//		System.out.println("My fullname is: " + fullName);//Pramod@Sitaprao
//		System.out.println("Length of fullname is: "+ fullName.length());//15
//		
//		//charAt() method
//		for(int i=0; i<fullName.length(); i++) {
//			System.out.println(fullName.charAt(i));

		// compare the string by using compareTo() method
//		String name1 = "Pramod";
//		String name2 = "Pramod";

		// 1. s1>s2 : +ve
		// 2. s1 == s2 : 0
		// 3. s1 < s2 : -ve
		// result should be Zero

//		if(name1.compareTo(name2) == 0) {
//			System.out.println("Strings are equal.");
//		}
//		else {
//			System.out.println("Strings are not equal.");
//		}

		// compare strings by using == operator
//		if(name1 == name2) {
//			System.out.println("Strings are equal.");
//		}
//		else {
//			System.out.println("Strings are not equal.");
//		}

		// checking compare by using String object
//		if(new String("Pramod") == new String("Pramod")) {
//			System.out.println("Strings are equal.");
//		}else {
//			System.out.println("Strings are not equal.");
//		}

		// subString() method
//		String sentence = "My name is Pramod";
//		String name = sentence.substring(11, sentence.length());
//		System.out.println(name);

//		String sentence = "PramodSitaprao";
//		String name = sentence.substring(6);
//		System.out.println(name);

		String sentence = "PramodSitaprao";
		String name = sentence.substring(0, 6);// 0 to 6-1 = 5.
		System.out.println(name);// Pramod

		String s1 = " Pramod  Sitaprao ";
		String s2 = s1.trim();// trim() methods removes spaces before the string 
		//and after ending the string, not in between spaces.				
		System.out.println(s2);// Pramod Sitaprao
		
		char s3 = s1.charAt(2);//0, 1, 2 = r
        System.out.println(s3);
        
        int index= s1.indexOf("S");//7
        int lastIndex= s1.lastIndexOf("Sitaprao");//Search a string for the last occurrence 
        //of "Sitaprao" repated string
        //System.out.println(index );//7
        System.out.println(lastIndex);
	}

}
