

class University {
	
	String usn="BIT445";
}

class College extends University {
	
	String name="BIT College Of Engineering";
}

class Department extends College {
	
	int fee=56789;
}

public class MultiLevelInheritance {

	
	public static void main(String[] args) {
		
		Department d=new Department();
		System.out.println("USN = "+d.usn);
		System.out.println("College Name  = "+d.name);
		System.out.println("College Fee = "+d.fee);
	}
	
	
	
}
