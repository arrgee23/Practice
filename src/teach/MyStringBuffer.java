package teach;

public class MyStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hjgaMANUhashj");
		sb.delete(sb.indexOf("MANU"),sb.indexOf("MANU")+4);
		System.out.print(sb);
	}

}
