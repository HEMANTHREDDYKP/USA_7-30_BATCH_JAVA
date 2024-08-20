package AbstractionEx;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		Calcy c=new CalcyImpli();
		
		while(true) {
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.Exit");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			int x=0;
			int y=0;
			
			if(choice>=1 && choice<=4) {
				System.out.println("Enter 2 numbers");
				x=s.nextInt();
				y=s.nextInt();
				
			}
			
			switch(choice) {
			case 1:
				System.out.println("Sum of "+x+" and "+y+" = "+c.add(x, y));
				break;
			case 2:
				System.out.println("Sub of "+x+" and "+y+" = "+c.sub(x, y));
				break;
			case 3:
				System.out.println("Mul of "+x+" and "+y+" = "+c.mul(x, y));
				break;
			case 4:
				System.out.println("Div of "+x+" and "+y+" = "+c.div(x, y));
				break;
			case 5:
				System.out.println("Thank you");
				System.exit(0);
			}
			
			
			
		
		}
		
		
		
		
	}
	
	
}
