
public class LogicalOper {

	public static void main(String[] args) {
		
		
		int a=5;
		int b=4;
		int c=9;
		
		boolean res=(a>b)||(a<b);
		          // t       f   ----> t
		System.out.println(res);
		
		boolean res1=(a>b)||(a<=c)||(a==a);
		           // t      t      t    -----> t
		
		System.out.println(res1);
		
		boolean res2=(a>c)||(a<=c)||(a==a);
		    //         f      t       t     -----> t
		System.out.println(res2);
		
		
		
		
		boolean res3=!(a>b);
		System.out.println(res3);
		
		
		boolean res4=!(a>b)&&(c==a);
		        //   !t       f
		        //   f        f   -----> f
		
		System.out.println(res3);
		
		
//		int a=5;
//		int b=4;
//		int c=9;
		boolean res5=!(a>b)&&(c==a)||(a<=c);
		         //   f        f       t
		
		System.out.println(res5);
		
		
		
	}
	
	
	
}
