package hime;
class Employee {
	
	void work() {
		System.out.println("Working");
	}
	
}
class Developer extends Employee {
	
	@Override
	void work() {
		super.work();
		System.out.println("Developing Application");
		
	}
}
public class MethodOverriding1 {
	public static void main(String[] args) {
		//Developer d =new Developer();
		new Developer().work();
		
	}
	
}
