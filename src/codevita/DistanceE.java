package codevita;

import java.io.File;
import java.util.Scanner;

public class DistanceE {

	public static void main(String[] args) {
		//Scanner s = new Scanner(new File("test.txt"));
		Scanner s = new Scanner(System.in);
		final double three = (double) 1.7320508075688772;
		double a = s.nextDouble();
		double d = s.nextDouble();
		if(a<=0 || a>57*d){
			System.out.println("Invalid Input");
		}else if(d<=0 || d>1.7*a)
			System.out.println("Invalid Input");
		else{
		double x = a-d/three;
			System.out.println("X= "+x);
			System.out.println("Y= "+Math.sqrt((a-x)*(a-x)+d*d));
		}
	}

}
