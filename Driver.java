
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements Lookconfig, ActionListener, KeyListener,
		MouseListener, MouseMotionListener {

	// properties of this class - the panel that shows up
	
	Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	
    private int[][] table = new int [8][8];
	
	JLabel time;
	
	Color c= new Color(210,250, 200);

	JLabel label_lives = new JLabel("monster_lives");
	JLabel label_result= new JLabel("monster_lives");
	
   
	
	
	// only do drawing for paint
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(10,180,140));
		
		table(g);
		
		//http://www.java2s.com/Code/Java/2D-Graphics-GUI/DrawrectanglesusethedrawRectmethodTofillrectanglesusethefillRectmethod.htm
		
	}
	
	public void table(Graphics g){
		g.fillRoundRect(0, 0, space+(size+space)*table[0].length,space+(size+space)*table[0].length, arc,arc);
		//draw the grid
		
		g.setColor(new Color(245,245, 200));
		
		for(int r=0; r< table.length; r++){
			
			for(int c=0; c<table[r].length; c++){
				
			   g.fillRect(space+(space+size)*r,space+(space+size)*c , size, size);

	       }

	
		}
	}


	
	
	
	

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		repaint();
	}

	public static void main(String[] arg) {
		Driver d = new Driver();
	}

	public Driver() {
		JFrame f = new JFrame();
		f.setTitle("Picture Matching");
		f.setSize(700, 800);
		f.getContentPane().setBackground(c);
		
		f.setResizable(false);
		f.setLayout(null);
		
		// end creating objects
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
        JButton startJB = new JButton("START");
		
		startJB.setBounds(30,700,100,40);
		
		
		startJB.setFocusable(false);
		
		
		f.add(startJB);
		
		//rank
		
		JButton rank = new JButton("Rank");
		rank.setFocusable(false);
		
		rank.setBounds(30,50,100,40);
		
		f.add(rank);
		
		//show time button
		JLabel jl = new JLabel("Time:");
		
		jl.setBounds(440,700,80,50);
		
		f.add(jl);
		
		jl.setVisible(true);
		
		JButton saveGame = new JButton("save");
		saveGame.setFocusable(false);
		saveGame.setBounds(320, 700, 100, 40);
		this.add(saveGame);
		
		//show the remaining time
		JLabel timeJl = new JLabel("90");
		
		timeJl.setBounds(520,700,80,50);
		
		f.add(timeJl);
		
		timeJl.setVisible(true);
		
		
        
	}

	Timer t;
	

		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		t.start(); //update is being called every 17ms so time has to go up by 17ms
		
		 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	public void reset() {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	


	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
