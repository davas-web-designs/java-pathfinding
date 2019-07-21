import java.awt.*;
import javax.swing.*;

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
	} 
	public void paint( Graphics g ){
		int i = 0;
		for ( int x = 0; x < s*w; x += s ){
			int j = 0;
			for ( int y = 0; y < s*w; y += s ){
				//System.out.println(i + " " + j);
				if(maze[j][i] == 1){
					g.setColor(Color.YELLOW);
				}else{
					g.setColor(Color.RED);
				}
				
				g.fillRect( x, y, s, s);				
				j++;
			}	
			i++;
		}	
	}
	private int s = 30;
	private int w = 10;
	private int[][] maze = {
				{1,0,0,0,1,0,1,0,1,1},
				{1,1,0,0,1,0,1,0,1,1},
				{1,0,1,0,0,0,1,0,0,1},
				{1,0,0,1,1,0,1,0,1,0},
				{1,0,0,0,1,0,0,0,0,1},
				{1,0,1,0,0,0,1,0,1,1},
				{1,0,0,0,1,0,0,1,1,1},
				{1,0,1,0,0,0,1,0,1,0},
				{1,0,0,0,1,0,1,0,0,1},
				{1,1,1,1,1,1,1,1,1,1}
		};
	
}
