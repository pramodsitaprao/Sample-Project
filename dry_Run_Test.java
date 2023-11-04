package String_In_Java;
//take one number, add and count each individual numbers.
public class dry_Run_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0, count=0;
		int x=123456;
		while(x!=0) {
			int y=x%10;//y=6, 5, 4, 3, 2, 1
			sum=sum+y;//sum=6,11, 15, 18, 20, 21 
			x=x/10;//x=12345, 1234, 123, 12, 1, 0
			count++;//1, 2, 3, 4, 5, 6
			
		}
		System.out.println("Count: "+count+" Sum: "+sum);
	}

}
