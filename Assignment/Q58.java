package Assignment8;

import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter a index: ");
			int index=sc.nextInt();
			sc.close();
			
			System.out.println(str[index]);
			
		} catch (Exception e) {
			System.out.println("array index is out of range");
			System.out.println(e);
		}
		
		
		
	}

}
