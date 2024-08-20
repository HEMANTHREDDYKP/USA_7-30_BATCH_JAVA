
public class Sam {

	
	int age=34;
	
	void eating() {
		System.out.println("Sam is eating");
		
	}
	
	
	public static void main(String[] args) {
		
		//className objectName = new className();
		Sam s=new Sam();
		
		System.out.println(s.age);
		s.eating();
		
		Sam s1=new Sam();	
		s1.age=56;
		
	}
	
}
