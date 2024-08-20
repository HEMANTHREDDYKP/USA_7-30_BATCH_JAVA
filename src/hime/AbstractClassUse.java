package hime;



abstract class Shape {
	
	abstract void colour();
	
}


 class Square extends Shape {

	@Override
	void colour() {
		System.out.println("Red");
	}
}


public class AbstractClassUse {

}
