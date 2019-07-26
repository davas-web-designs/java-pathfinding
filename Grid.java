import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Grid{

	public static void main( String args[] ){
		drawGrid application = new drawGrid();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
	}

}

class drawGrid extends JFrame {

	public drawGrid(){       
		setSize( 500, 500 );
		setVisible( true );  
		bfs(1,1); 
	} 
	public void paint( Graphics g ){
		int i = 0;
		for ( int x = 0; x < s*w; x += s ){
			int j = 0;
			for ( int y = 50; y < s*w + 50; y += s ){
				//System.out.println(i + " " + j);
				if(maze[j][i] == 1){
					g.setColor(Color.YELLOW);
				}else if(maze[j][i] == 0 || maze[j][i] == 2 || maze[j][i] == 3){
					g.setColor(Color.RED);
				}else if(maze[j][i] == 9){
					g.setColor(Color.BLACK);				
				}
				
				g.fillRect( x, y, s, s);				
				j++;
			}	
			i++;
		}	
	}
	//DFS:
	public void dfs(int r, int c){
		if(maze[r][c] != 3){
			maze[r][c] = 9;
			ArrayList<IntPair> n = neighbours(r,c);
			for(IntPair i: n){
				System.out.println("(" + i.x + " , "+ i.y + ")");
				if(maze[i.x][i.y] == 3)System.out.println("Goal!");	
				else if(maze[i.x][i.y] == 0){
					dfs(i.x, i.y);
				}
						
			}
		}else{
			System.out.println("Goal!");		
		}
	}
	//BFS:
	public void bfs(int r, int c){
		Queue<IntPair> q = new LinkedList();
		IntPair start_v = new IntPair(r,c);
		q.add(start_v);
		while(q.size() > 0){
			IntPair p = q.remove();
			if(maze[p.x][p.y] == 3) System.out.println("GOAL!");
			else{
				ArrayList<IntPair> n = neighbours(p.x,p.y);
				for(IntPair i: n){
					System.out.println("(" + i.x + " , "+ i.y + ")");
					if(maze[i.x][i.y] == 0){
						maze[i.x][i.y] = 9;
						q.add(i);
					}					
				}			
			}	
		}
	}

	public ArrayList<IntPair> neighbours(int a, int b){
		ArrayList<IntPair> n = new ArrayList<IntPair>();

		if(maze[a][b+1] == 0){
			IntPair p = new IntPair(a, b+1);
			n.add(p);	
		}
		if(maze[a][b-1] == 0){
			IntPair p = new IntPair(a,b-1);
			n.add(p);
		}
		if(maze[a+1][b] == 0){
			IntPair p = new IntPair(a+1,b);
			n.add(p);
		}
		if(maze[a-1][b] == 0){
			IntPair p = new IntPair(a-1,b);
			n.add(p);	
		}
		return n;
	}

	private int s = 30;
	private int w = 10;
	private int[][] maze = {
				{1,1,1,1,1,1,1,1,1,1},
				{1,2,0,0,0,0,1,1,1,1},
				{1,0,1,1,1,0,1,1,1,1},
				{1,0,1,0,0,0,1,1,1,1},
				{1,0,1,1,1,0,1,1,1,1},
				{1,0,0,0,0,0,0,0,1,1},
				{1,1,0,1,1,0,1,0,1,1},
				{1,1,0,0,0,0,1,0,1,1},
				{1,1,1,1,1,0,1,0,3,1},
				{1,1,1,1,1,1,1,1,1,1}
		};
	
}

class IntPair{
	final int x;
	final int y;
	IntPair(int x, int y) {this.x=x;this.y=y;}
}
