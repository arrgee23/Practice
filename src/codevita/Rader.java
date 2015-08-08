package codevita;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Rader {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pattern = "#.#####";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		
		double x=s.nextDouble();
		double y=s.nextDouble();
		double m=s.nextDouble();
		double phi=s.nextDouble();
		
		double pi = Math.PI;
		double z = Math.sqrt((x*x + y*y - 2*x*y*Math.cos(phi*pi/180)));
		
		
		double p=(x+y+z)/2;
		double area = Math.sqrt(p*(p-z)*(p-y)*(p-x));
		
		double rarea = pi*m*m*phi/360;
		System.out.println(String.format("%.5f",area-rarea));
		System.out.println(String.format("%.5f",z));
		//System.out.println((float)(area-rarea));
	}

}
