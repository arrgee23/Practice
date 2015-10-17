package codemonk;

import java.util.Scanner;

public class NT1_4 {
	static int[] arr;
	static final int mod = 1000000007; 
	
	static long gcd(long a,long b){
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		long gx = g();
		long fx=f();
		
		System.out.print(pow(fx,gx));
		
	}

	private static long pow(long a, long b) {
		long ans=1;
		while(b != 0){
			if(b%2==1)
				ans = (ans*a)%mod;
			
			b=b/2;
			a = a*a;
			a %=mod;
		}
		return ans;
	}

	private static long f() {
		long res=1;
		for (int i = 0; i < arr.length; i++) {
			res*= arr[i];
			res %= mod;
		}
		return res;
	}

	private static long g() {
		long res= arr[0];
		
		for(int i=1;i<arr.length;i++){
			res = gcd(res,arr[i]);
		}
		return res;
	}

}
