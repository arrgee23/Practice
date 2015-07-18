package rahul.ds.arrays_strings;

public class MakeZero {
	static void makeZero(int[][] a){
		int[] rows = new int[a.length];
		int[] cols = new int[a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] == 0)// mark that row and col
				{
					rows[i] = 1;cols[j] = 1;
				}	
			}
		}
		// now remove zeros in rows
		for (int i = 0; i < rows.length; i++) {
			if(rows[i]==1){
				for (int j = 0; j < cols.length; j++) {
					a[i][j] = 0;
				}
			}
		}
		// zeros in col
		for (int i = 0; i < cols.length; i++) {
			if(cols[i]==1){
				for (int j = 0; j < rows.length; j++) {
					a[j][i] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[][] a = { {0,2,3,4},
				  {5,6,7,8},
				  {9,10,0,12},
				  {13,14,15,16}
				};
		makeZero(a);
		printMatrix(a);
	}
	private static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
