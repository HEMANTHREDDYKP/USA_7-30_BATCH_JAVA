package RunTimePolymorphism;


class Employee {
	
	void work() {
		System.out.println("Working");
	}
}

class Developer extends Employee {
	
	@Override
	void work() {
		System.out.println("Developing App");
	}
}

class Tester extends Employee {
	
	@Override
	void work() {
		System.out.println("Testing App");
	}
	
}

public class Example {
                   //Employee obj=new Developer();
	static void status(Employee obj) {
		obj.work();
	}
	
	public static void main(String[] args) {
		status(new Developer());
		status(new Employee());
	}
}
