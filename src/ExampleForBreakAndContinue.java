
public class ExampleForBreakAndContinue {

	
	
	public static void main(String[] args) {
		
		
		//1 2 4 5
		
		for (int i = 1; i <=5; i++) {
			
			
			if(i==3) {
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("---------------");
		
       for (int i = 1; i <=5; i++) {
			
			
			if(i==3) {
				break;
			}
			
			System.out.println(i);
		}
	}
}
