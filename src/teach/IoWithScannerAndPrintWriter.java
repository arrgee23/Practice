package teach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class IoWithScannerAndPrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		File fw = new File("output.txt");
		
		try {
			Scanner s = new Scanner(f);
			PrintWriter pr = new PrintWriter(fw);
			
			while(s.hasNextLine())
				pr.println(s.nextLine());
			s.close();pr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
