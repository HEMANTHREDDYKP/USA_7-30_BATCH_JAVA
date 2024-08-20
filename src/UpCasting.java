


class Father1 {
	
	int x=90;
}

class Son1 extends Father1 {
	
	int y=78;
}


public class UpCasting {

	public static void main(String[] args) {
		
		
		//superClass reference variable and sub class object
		Father1 f=(Father1)new Son1();
		Father1 f1=new Son1();
		System.out.println(f.x);
		System.out.println("---------------------------------");
		//subclass reference variable and upcasted reference variable
		          Son1 s=(Son1) f;
		        System.out.println(s.x);
		        System.out.println(s.y);
		
		
		
	}
	
}
