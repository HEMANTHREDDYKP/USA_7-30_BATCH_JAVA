package hime;


class College {
	
	public College( int fee) {
		
		System.out.println("College name is VSIS");
	}
}


class Department extends College {
	
	public Department() {
		super(67);
		System.out.println("Department name is AE");
	}
}


public class ConstructorChainingInDifferentClass {

	public static void main(String[] args) {
		
		Department d =new Department();
	}
}
