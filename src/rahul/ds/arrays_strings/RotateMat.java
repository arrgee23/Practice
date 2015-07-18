package rahul.ds.arrays_strings;

public class RotateMat {
	static void rotate(int[][] a,int l,int r){
		// base case
		if(r-l < 1) return;
		// rotate outer 1 breadth matrix
		else{
			for(int i = l; i<r; i++){
				int temp = a[r][l+i];
				a[r][l+i] = a[l+i][l];
				
				int temp2 = a[r-i][r];
				a[r-i][r] = temp;
				
				temp=a[l][r-i];
				a[l][r-i] = temp2;
				
				a[l+i][l] = temp;
			}
			rotate(a,l+1,r-1);
		}
	}
	
	public static void main(String[] args) {
		int[][] a = { {1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}
					};
		//int[][] b = {{1,2},{3,4}};
		rotate(a, 0, 3);
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
