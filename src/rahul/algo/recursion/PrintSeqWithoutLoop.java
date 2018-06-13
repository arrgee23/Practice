package rahul.algo.recursion;
/*
 * Input: n = 16
Output: 16, 11, 6, 1, -4, 1, 6, 11, 16

Input: n = 10
Output: 10, 5, 0, 5, 10
 */
public class PrintSeqWithoutLoop {
	
	public static void pr(int n) {
		System.out.print(n+" ");
		if(n>0) {
			pr(n-5);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		pr(10);
	}

}
