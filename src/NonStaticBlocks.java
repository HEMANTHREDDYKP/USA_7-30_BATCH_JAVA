


public class NonStaticBlocks {

	
	
	{
		System.out.println("Hi");
	}
	
	{
		System.out.println("Hello");
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("inside main");
		NonStaticBlocks n=new NonStaticBlocks();
		
	}
}
