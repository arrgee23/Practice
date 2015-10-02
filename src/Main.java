import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void print(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		while(t != 0){
			int n,k,p;
			n=s.nextInt();
			k=s.nextInt();
			p=s.nextInt();
			
			int[] a = new int[n+1];
			int[] b = new int[n+1];
			
			int[] dp = new int[n+1];
			
			for(int i=1;i<=n;i++)
				a[i]=s.nextInt();
			for(int i=1;i<=n;i++)
				b[i]=s.nextInt();
			
			
			dp[1] = Math.min(a[1], b[1]+p);
			boolean inA = true;
			//print(111);
			
			
			for(int i=2;i<=n;i++){
				int min = Integer.MAX_VALUE;
				
				int j=1;
				while(j<=k && i-j>=1){
					int cost;
					if(inA){
						cost=Integer.MAX_VALUE;
						if(i<=k){
							if(b[i]+p<a[i]){
								cost=b[i]+p;
								inA=false;
							}else
								cost=a[i];
								
						}else{
							cost = dp[i-j]+Math.min(a[i], b[i]+p);
							
						}
					}
					else{ // in b
						cost = Integer.MAX_VALUE;
						if(i<=k){
							if(a[i]+p<b[i]){
								cost=a[i]+p;
								inA=true;
							}else
								cost=b[i];
						}else{
							cost = dp[i-j]+Math.min(a[i]+p, b[i]);
						}
					}
						
					if(cost<min)
						min=cost;
					j++;
				}
				dp[i]=min;
			}
				
			System.out.println(dp[n]);
			t--;
		}
	}

	private static int calculate() {
		//Scanner s = new Scanner(System.in);
		return 0;
		
	}

}

	