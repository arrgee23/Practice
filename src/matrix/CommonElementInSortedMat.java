package matrix;
/*
 * Find a common element in all rows of a given row-wise sorted matrix
 */
public class CommonElementInSortedMat {

	public static void main(String[] args) {
		int mat[][] = { {1, 2, 3, 4,6},
                {2, 3, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9},
              };
		
		
		System.out.print(commonElement(mat));
	}

	private static int commonElement(int[][] mat) {
		int lastPtr[] = new int[mat.length]; // stores the last index of permitted max elements
		
		for (int i = 0; i < lastPtr.length; i++) {
			lastPtr[i] = mat[0].length-1;
		}
		
		int min = mat[0][lastPtr[0]];
		
		
		while(true){
			
			// check if all indices are valid
			int count = 0;	
			
			for (int i = 0; i < lastPtr.length; i++) {
				if(lastPtr[i]<0)
					return -1;
				else{
					if(mat[i][lastPtr[i]]==min)
						count++;
					else
						if(mat[i][lastPtr[i]]<min){
							//minIndex = i;
							min =mat[i][lastPtr[i]]; 
						}
					
				}
			}
			if(count==mat.length)
				return mat[0][lastPtr[0]];
			else{
				for(int i=0;i<lastPtr.length;i++)
					if(mat[i][lastPtr[i]]!=min)
						lastPtr[i]--;
			}
			
		}
		
	}

}
