
public class UnaryOp {

	
	
	public static void main(String[] args) {
		
		
		int a =2;
		
		int b=a++;
		
		System.out.println("b="  + b );
		System.out.println("a="+a);
		
		System.out.println("-------------------");
		
		int c=--a;
		
		System.out.println("c="  + c ); //--->2
		System.out.println("a="+a);  //---> 2
		
		System.out.println("----------------------");
		
		
		int d=a-- + a++  - --a + c-- ;
		     //2    1       1    2 
		
		
		System.out.println("d="  + d ); //--->4
		System.out.println("a="+a);  //---> 1
		System.out.println("c="+ c); // -->1
		
	}
}
