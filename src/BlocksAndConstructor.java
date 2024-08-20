
public class BlocksAndConstructor {

	{
		System.out.println("in non static");
	}
	
	static {
		System.out.println("in static");
	}
	
	BlocksAndConstructor(){
		System.out.println("in constructor");
	}
	
	
	public static void main(String[] args) {
		
		BlocksAndConstructor b=new BlocksAndConstructor();
	}
	
}
