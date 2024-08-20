
public class Car {

//  datatype vn =data;	
	double cost=300;
	
	void speed() {
		System.out.println("moves at 100 km/h");
	}
	
	public static void main(String[] args) {
//      datatype vn =data;
		
		Car c1=new Car();//300,speed()
		c1.cost=100;
		
		
		Car c2=new Car();//300 ,speed()
		
		
		
		
		System.out.println(c1.cost);
		System.out.println(c2.cost);
		
		
	}
	
}
