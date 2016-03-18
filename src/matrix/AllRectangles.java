package matrix;

public class AllRectangles {
	static final int row=3;
	static final int col=4;
	public static void main(String[] args) {
		
		for (int i = 0; i < row-1; i++) {
			for (int j = 0; j < col-1; j++) {
				for (int k = i+1; k < row; k++) {
					for (int l = j+1; l < col; l++) {
						System.out.println(i+" "+j+" "+k+" "+l);
					}
				}
			}
		}

	}

}
