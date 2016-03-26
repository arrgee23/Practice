package codechef;

import java.util.Scanner;

public class Easy3 {

	static final long MOD=1000000007;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long t = s.nextInt();
		
		while(t>0){
			int n = s.nextInt();
			long k = s.nextLong();
			
			long[] arr = new long[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.nextInt();
			}
			
			System.out.println(calculate(arr,k));
			
			t--;
		}

	}

	private static long calculate(long[] arr, long k) {
		long total=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			long totalCostForThis=0;
			for (int j = i+1; j < arr.length; j++) {
				long dis = Math.abs(arr[i]-arr[j]);
				totalCostForThis = (totalCostForThis+power(dis,k))%MOD;
			}
			total = (total+(2*totalCostForThis)%MOD)%MOD;
		}
		return total;
	}

	private static long power(long dis, long k) {
		if (k==0)
			return 1;
		if(k==1)
			return dis%MOD;
		
		long y=1;
		
		while(k>1){
			if(k%2==0){
				dis=(dis*dis)%MOD;
				k /=2;
			}else{
				y=(y*dis)%MOD;
				dis=(dis*dis)%MOD;
				k = (k-1)/2; 
			}
		}
		return (y*dis)%MOD;
	}

}
