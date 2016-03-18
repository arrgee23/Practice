package matrix;
/*
 * Count number of islands where every island is row-wise and column-wise separated
 */
public class CountIslands {

	public static void main(String[] args) {
		char mat[][] ={{'X', 'O', 'O', 'O', 'O', 'O'},
	              {'X', 'O', 'X', 'X', 'X', 'X'},
	              {'O', 'O', 'O', 'O', 'O', 'O'},
	              {'X', 'X', 'X', 'O', 'X', 'X'},
	              {'X', 'X', 'X', 'O', 'X', 'X'},
	              {'O', 'O', 'O', 'O', 'X', 'X'},
	             };
		System.out.println(count(mat));
	}

	private static int count(char[][] mat) {
		int count=0;
		
		boolean[][] visited=new boolean[mat.length][mat[0].length];
		
		// iterate
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[0].length; j++) {
				if(mat[i][j]=='X' && !visited[i][j]){
					count++;
					markVisted(i,j,mat,visited);
				}
			}
		}
		
		return count;
		//return count;
	}

	private static void markVisted(int i, int j, char[][] mat,
			boolean[][] visited) {
		// mark this as visited
		if(!visited[i][j] && mat[i][j]=='X')
			visited[i][j]=true;
		
		if(j+1<mat[0].length && mat[i][j+1]=='X')
			markVisted(i,j+1,mat,visited);
		if(i+1<mat.length && mat[i+1][j]=='X')
			markVisted(i+1,j,mat,visited);
		
	}

}
