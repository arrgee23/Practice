package codevita;
import java.util.Scanner;

/**
 * Consider float values
 * @author rahul
 *
 */
public class Acatch {
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		//Scanner s = new Scanner(new File("test.txt"));
		long n = s.nextLong();
		
		for (long i = 0; i < n; i++) {
			long F=s.nextLong();
			long B=s.nextLong();
			long T=s.nextLong();
			long FD=s.nextLong();
			long BD=s.nextLong();
			
			calculate(F,B,T,FD,BD);
		}
		//calculate(9 ,4 ,3 ,13 ,10);
	}

	private static void calculate(long f, long b, long t, long fd, long bd) {
		// falls in the first step
		if(b>=bd)
			System.out.println(bd*t +" B");
		else{
			if(f==b)
				System.out.println("Thank God");
			else if(b>f){
				long ed = bd-b;
				long smallStepSize = b-f;
				long smallStepTime = (f+b)*t;
				
				long smallStepNo;
				if(ed%smallStepSize==0)
					smallStepNo = ed/smallStepSize;
				else
					smallStepNo = (ed/smallStepSize)+1;
				long rest = bd-(smallStepNo*smallStepSize);
				long time = smallStepNo*smallStepTime+rest*t;
				
				System.out.println(time+" B");
			}
			else{ // bigger backward step
				//long dist = bd+f; // on fw step extra
				long ed = fd-f+b;
				long smallStepSize = f-b;
				long smallStepTime = (f+b)*t;
				long time = b*t; // one forward step
				
				long smallStepNo;
				if(ed%smallStepSize==0)
					smallStepNo = ed/smallStepSize;
				else
					smallStepNo = (ed/smallStepSize)+1;
				
				long rest = fd+b-(smallStepNo*smallStepSize);
				
				time += smallStepNo*smallStepTime+rest*t;
				System.out.println(time+" F");
			}
		}
	}
}
