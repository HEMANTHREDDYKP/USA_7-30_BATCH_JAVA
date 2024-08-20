
class Demo {
	void display() {
		System.out.println("display");
	}
	
	void display(int age) {
		System.out.println("age = "+age);
	}
	
	void display(String name,int age) {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
	
public static void main(String[] args) {
		
		Demo d=new Demo();
		d.display();
		System.out.println("------");
		d.display(23);
		d.display("Sam",56);
	}
	
}

