package hime;


class Whatsapp1{
	
	void sendMessage() {
		System.out.println("test message only single tick");
	}
}

class Whatsapp2 extends Whatsapp1{
	
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("double tick");
	}
	
	void story() {
		System.out.println("Only images Suppoeted");
	}
}
class Whatsapp3 extends Whatsapp2{
	
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("blue tick");
	}
	
	@Override
	void story() {
		super.story();
		System.out.println("videos also Suppoeted");
	}
	
	void payment() {
		System.out.println("Payments can be done");
	}
}



public class InheritanceExample {

	
	public static void main(String[] args) {
		
		Whatsapp3 w = new Whatsapp3();
		w.sendMessage();
		System.out.println("-------------");
		w.story();
		System.out.println("-------------");
		w.payment();
	}
}
