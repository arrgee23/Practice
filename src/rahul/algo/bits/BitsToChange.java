package rahul.algo.bits;

public class BitsToChange {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 15;
		
		int res = a^b;
		
		int mask = 1;
		
		int count=1;
		int ans=0;
		while(count<32){
			if((res & mask) != 0){
				ans++;
			}
			mask = mask<<1;
			count++;
		}
		System.out.println(ans);

	}

}
