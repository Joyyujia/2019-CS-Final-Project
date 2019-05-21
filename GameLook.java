import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameLook extends JFrame implements Lookconfig{
	
	private int[][] table = new int [8][8];
	
	JLabel time;

	public static void main(String[] args) throws InterruptedException {
		GameLook g = new GameLook();
		
		g.showUI();
		
	}

	public void showUI() throws InterruptedException {
		setTitle("Picture Matching");
		setSize(700,800);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setResizable(true);
		setLayout(null);
		
		//add new buttons
		
		//start button
		
		JButton startJB = new JButton("START");
		
		startJB.setBounds(30,700,100,40);
		
		startJB.setFocusable(false);
		
		this.add(startJB);
		
		//rank
		
		JButton rank = new JButton("Rank");
		
		rank.setBounds(30,100,100,40);
		
		this.add(rank);
		
		//show time button
		JLabel jl = new JLabel("Time:");
		
		jl.setBounds(440,700,80,50);
		
		this.add(jl);
		
		jl.setVisible(true);
		
		//show the remaining time
		JLabel timeJl = new JLabel("90");
		
		timeJl.setBounds(520,700,80,50);
		
		this.add(timeJl);
		
		timeJl.setVisible(true);
		
		GameListener gl = new GameListener();
		
		gl.setFrame(this);
		
		gl.setTimeJl(timeJl);
		
		gl.setArray(table);
		
		startJB.addActionListenwe(gl);
		
		jl.addactionListener(gl);
		
		
		
	}
	
@Override

public void paint(Graphics g){
	super.paint(g);
	
	PaintPics(g);
	
}

public void PaintPics (Graphics g){
	Image i= createImage(space+(size+space)*table[0].length,space+(size+space)*table.length);
	
	Graphics2D grid = (Graphics2D) i.getGraphics();
	
	grid.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
	

	//create a rect background
	
	grid.setColor(new Color(210,180,140));
	
	grid.fillRoundRect(0, 0, space+(size+space)*table[0].length,space+(size+space)*table[0].length, arc,arc);
	
	//draw the grid
	
	grid.setColor(new Color(245,245, 200 ));
	
	for(int r=0; r< table.length; r++){
		
		for(int c=0; c<table[r].length; c++){
			
			grid.fillRect(space+(space+size)*r,space+(space+size)*c , size, size);
			
		}
		
	}
	
	//add pictures
	
	
	
	
	
	
	
}
	

}
