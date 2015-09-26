package codevita2;
import java.util.LinkedList;
import java.util.Scanner;

public class Blobs {
	//int g[202][202] = {0};
	//int w[202][202] = {0};

	static int dx[] = {-1,0,1,1,1,0,-1,-1};
	static int dy[] = {1,1,1,0,-1,-1,-1,0};
	
	private static void addValue(LinkedList<Integer> llist,int val) {

        if (llist.size() == 0) {
            llist.add(val);
        } else if (llist.get(0) > val) {
            llist.add(0, val);
        } else if (llist.get(llist.size() - 1) < val) {
            llist.add(llist.size(), val);
        } else {
            int i = 0;
            while (llist.get(i) < val) {
                i++;
            }
            llist.add(i, val);
        }

    }
	
	
	static int dfs(char[][] g,int x,int y,int row,int col){
		if(x>=row || x<0 || y>=col || y<0)
			return 0;
		
		
		g[x][y] = '*'; // mark visited
		
		int size=1; // this node counts
	    for(int i=0; i<8;i++){
	        int nx = x+dx[i], ny = y+dy[i];
	       
	        // out of bound
	        if(nx>=row || nx<0 || ny>=col || ny<0)
				continue;
	        
	        if(g[nx][ny] == '#')
	        	size += dfs(g,nx,ny,row,col); // add the sizes
	    }
	    return size;
	}
	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		while(t != 0){
			
			//int set = 1;
		    
		    int row = s.nextInt();
		    int col = s.nextInt();
		    
		    char[][] g = new char[row][col];
		    //char[][] w = new char[row][col];
		    
		    for(int i=0; i<row; i++) 
		    	g[i] = s.next().toCharArray();
		    
		    LinkedList<Integer> llist = new LinkedList<Integer>();
		    
		    for(int i=0; i<row;i++)
		        for(int j=0; j<col; j++)
		        	if(g[i][j] == '#'){
		        		int n = dfs(g,i,j,row,col);
		        		addValue(llist, n);
		        	}
		    
		    System.out.println(llist.size());
		    for(int i=0;i<llist.size();i++)
		    	System.out.print(llist.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}
