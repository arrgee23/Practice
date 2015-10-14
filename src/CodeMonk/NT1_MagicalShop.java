package CodeMonk;
import java.util.Scanner;


public class NT1_MagicalShop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		long a=s.nextLong();
		long b=s.nextLong();
		
		String c=s.next();
		
		long ans=0;
		for (int i = 0; i < c.length(); i++) {
			if(c.charAt(i)=='1'){
				ans = (ans+a)%b;
			}
			a = (a*a)%b;
		}
		System.out.println(ans);
	}

}
