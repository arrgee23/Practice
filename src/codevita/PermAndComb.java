package codevita;
import java.util.Scanner;

public class PermAndComb {
	static final long MOD = 1000000007;
	
	static long fact(long r){
		long ans=1;
		long cpy=r;
		for(long i=0;i<r;i++){
			ans *= cpy--;
			if(ans>MOD){
				ans %= MOD;
			}
		}
		return ans;
	}
	
	// r can be bigger than n
	static long perm(long n,long r){
		long ans = 1;
		for(long i=0;i<r;i++){
			//System.out.println("ans:"+ans+" n: "+n);
			ans*=n--;
			if(ans>MOD)
				ans = ans%MOD;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n=s.nextInt();
		//System.out.print(2*MOD);
		for(long i=0;i<n;i++){
			long nn = s.nextInt();
			long k=s.nextInt();
			if(k/2>nn/2){
				System.out.println(0);
			}else{
				long perm=perm(nn/2,k/2);
				long comb = perm/fact(k/2);
				//System.out.println(fact(k/2)%MOD);
				System.out.println(perm);
				System.out.println(comb);
				//System.out.println((perm+comb)%MOD);
			}
			
		}
	}

}
