package rahul.collection;

public class StringBufferAndArray {
	public static void main(String[] args) {
		String s = "rahul";
		
		StringBuffer sb = new StringBuffer("rahul");
		char[] ca = {'r','a','h','u','l'};
		char[] cb = new char[10];
		String ss = new String(ca);
		
		String sss = s.concat("sas");
		System.out.print(sss);
	}
}
