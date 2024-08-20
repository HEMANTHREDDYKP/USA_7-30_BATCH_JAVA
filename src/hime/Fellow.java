package hime;

public class Fellow {

	
	
	public static void main(String[] args) {
		int c=0;
		int[] a= {1,2,3,4};//[24,12,8,6]
		int pro=1;
		int[] ans=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			
			if(c==i) {
				
				continue;
			}
			pro=pro*a[i];
			if(i==3) {
				i=-1;
				System.out.println(pro);
				pro=1;
				c++;
			}
			
		}
		pro=1;
		for (int i = 0; i < ans.length-1; i++) {
		
			pro=pro*a[i];
			
		}
		System.out.println(pro);
		
	}
	
	
}
