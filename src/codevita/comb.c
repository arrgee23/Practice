 int MOD = 1000000007;
	
	int fact(int r){
		int ans=1;
		int cpy=r;
		int i;
		for( i=0;i<r;i++){
			ans *= cpy--;
			if(ans>MOD){
				ans %= MOD;
			}
		}
		return ans;
	}
	
	// r can be bigger than n
	int perm(int n,int r){
		int ans = 1;
		int i;
		for(i=0;i<r;i++){
			ans*=n--;
			if(ans>MOD)
				ans = ans%MOD;
		}
		return ans;
	}
	
	int main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		scanf("%d",&n);
		//System.out.print(2*MOD);
		for(int i=0;i<n;i++){
			int nn ,k;
			scanf("%d",&nn);scanf("%d",&k);
			int perm=perm(nn/2,k/2);
			int comb = perm/fact(k/2);
			//System.out.println(fact(k/2)%MOD);
			printf("%d\n",(perm+comb)%MOD);
			
		}
		return 0;
	}
