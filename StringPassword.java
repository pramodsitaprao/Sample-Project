package String_In_Java;

import java.io.Console;

public class StringPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using Console class for taking user password for security reason
		
		String username; 
		char pass[];
		Console obj= System.console();
		
		System.out.print("Enter username");
		username = obj.readLine();
		System.out.print("Enter password: ");
		pass = obj.readPassword();
		//String a=String.valueOf(pass);
		
		System.out.print("Userame: "+ username);
		System.out.print("Passwors is "+pass);
	}

}
