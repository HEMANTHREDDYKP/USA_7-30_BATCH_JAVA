
public class Methods {

	//as/am r mn()  {//}
	
	//m wo r and wo ar
	
	static void add() {
		int a=3;
		int b=7;
		
		System.out.println(a+b);
	}
	//m wo r and w a
	
	static void add(int a , int b) {
		
		int res=a+b;
		System.out.println(res);
	}
	
	
	//m w r and wo ar
	
	static String name() {
		
		String n="Hemanth KP";
		return n;
	}
	
	
	//m w r and w a
	
	static int sub(int a,int b) {
		
		int res=a-b;
		
		return res;
	}
	
	public static void main(String[] args) {
		
		//add();//method calling or function calling
		//add(1,3); //---> 4
		//add(5,8);  //--->13
//		String n=name();
//		System.out.println(n);//-->Hemanth KP
		
		int res=sub(2,7);
		System.out.println(res);
		
		
	
		
	}
	
	
	
}
