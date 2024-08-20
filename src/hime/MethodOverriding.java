package hime;

class Father {
	
	void bike() {
		System.out.println("Old Fashioned bike");
	}
}

class Son extends Father {
	
	@Override
	void bike() {
		super.bike();
		System.out.println("New modified bike");
	}
	
}

public class MethodOverriding {
	public static void main(String[] args) {
		 Son s=new Son();
		 s.bike();
	}
	
}
