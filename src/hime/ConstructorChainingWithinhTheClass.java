package hime;


class Flipkart {
	
	
	public Flipkart() {
       this(50);
		System.out.println("Ordered the items from Flipkart");
	}
	
	public Flipkart(int numberOfOrders) {
       this(10,"Laptop");
		System.out.println("ordered "+ numberOfOrders+" items");
	}
	public Flipkart(int numberOfOrders,String nameOfTheOrder) {

		System.out.println(numberOfOrders+" "+nameOfTheOrder+" bought from Flipkart");
	}
	
}

public class ConstructorChainingWithinhTheClass {

	public static void main(String[] args) {

		Flipkart f =new Flipkart();
	}

}
