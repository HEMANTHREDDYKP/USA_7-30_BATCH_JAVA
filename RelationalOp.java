
public class RelationalOp {

	public static void main(String[] args) {

		// > < >= <= ==
		// RO ---> boolean o/p ----> true or false

		int a = 10;
		int b = 5;

		boolean res = a > b; // ---> true
		boolean res1 = a < b; // ---> false
		boolean res2 = a >= b; // ---> true
		boolean res3 = a <= b; // ---> false
		boolean res4 = a == b; // ---> false
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}
}
