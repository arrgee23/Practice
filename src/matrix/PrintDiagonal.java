/**
 *  1     2     3     4
    5     6     7     8
    9    10    11    12
   13    14    15    16
   17    18    19    20
   
   to:
     1
    5     2
    9     6     3
   13    10     7     4
   17    14    11     8
   18    15    12
   19    16
   20
 */
package matrix;

/**
 * @author rahul
 *
 */
public class PrintDiagonal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m[][] ={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16},
                    {17, 18, 19, 20},
               };
		
		int row = m.length;
		int col = m[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=i,k=0;j>=0&&k<col;j--,k++){
				System.out.print(m[j][k]+" ");
			}
			System.out.println("");
		}
		
		if(col>1){
			for(int i=1;i<col;i++){
				for(int j=i,k=row-1;j<col;j++,k--){
					System.out.print(m[k][j]+" ");}
				System.out.println("");
			}
		}
	}

}
