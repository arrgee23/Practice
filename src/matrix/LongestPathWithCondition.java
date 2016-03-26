package matrix;

public class LongestPathWithCondition {

	public static void main(String[] args) {
		int[][] mat= {	
						{1, 2, 6},
						{8, 3, 5},
						{4, 9, 7}
					};
		
		// holds record of the length of the path including this cell; 0 if unvisited
		int[][] lengths = new int[mat.length][mat[0].length];
		boolean[][] visited = new boolean[mat.length][mat[0].length];
	
		int max=0;
		for(int i=0;i<mat.length;i++){
			for (int j = 0; j < mat[0].length; j++) {
				int n = findlen(mat,visited,mat[i][j]-1,i,j);
				lengths[i][j] = n;
				if(n>max)
					max=n;
				
			}
		}
		System.out.println(max);
		for(int i=0;i<mat.length;i++){
			for (int j = 0; j < mat[0].length; j++) 
				System.out.print(lengths[i][j]+" ");
				
			System.out.println("");
		}
	
	}

	private static int findlen(int[][] mat, boolean[][] visited,
			int prevValue,int x,int y) {
		if(x<0 || x>mat.length-1 || y<0 || y>mat.length-1 || visited[x][y])
			return 0;
		else{
			if(prevValue == mat[x][y]+1 || prevValue == mat[x][y]-1){
				visited[x][y]=true;
				return 1+findlen(mat,visited,mat[x][y],x+1,y)+
						findlen(mat,visited,mat[x][y],x-1,y)+
						findlen(mat,visited,mat[x][y],x,y+1)+
						findlen(mat,visited,mat[x][y],x,y-1);
			}else{
				return 0;
			}
		}
	}

}
