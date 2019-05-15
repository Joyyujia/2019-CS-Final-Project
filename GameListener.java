import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameListener extends MouseAdapter implements Lookconfig{ //keep track in the position
	
	private boolean flag= true;
	
	private int r1, c1, r2, c2; //position of the pictures
	
	private int x1,y1,x2,y2; // keep track in the mouse position
	
	private int position[][]; //save the position 
	
	private JFrame frame; //get the data using JFrame
	
	private Graphics2D g;
	
	JLabel time;
	
	//may need to implement TimeOut object to record the remaining time
	
	private int x, y; //save the position of x and y
	
	public void setTimeJl(JLabel Jl){
		time = Jl;
		
	}
	

	public void setFrame(JFrame frame) {
		this.frame =frame;
		g=(Graphics2D)frame.getGraphics();
		
		
	}
	
	public void setArray(int[][]array){
		position = array;
		
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		
		if(flag){
			x1 = e.getX() -40;
			y1 = e.getY() -50; //get the mouse position
			flag = false;
			
			
			
		}
		
	}
	


	

}
