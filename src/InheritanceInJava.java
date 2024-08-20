



class Father {
	
	int amount=8900;
	
	public void work() {
		System.out.println("Software Engineer");
	}
}


class Son extends Father {
	
	String name="Sam";
	
	
	public static void main(String[] args) {
		
		
		Son s=new Son();
		
		System.out.println(s.amount);
		System.out.println(s.name);
		s.work();
		
		
		
	}
}

