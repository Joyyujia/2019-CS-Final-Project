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
	
	JLabel time;
	
	Color c= new Color(210,250, 200);
	
	Table table = new Table("Table.png");
	//create an array of shooky
	JK[] shooky = new JK[2];
	JK jk = new JK("JK.png");
	Mang mang = new Mang("Mang.png");
	// only do drawing for paint
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(10,180,140));
		
		
	}
	public void equal(){
		for(int i =0; i<8; i++){
			for(int j =0; j<8; j++){
				
			}
		}
		for(int i=0; i<10000000; i++){
			int c= jk.nextInt(arc-3)+1;
			int d= jk.nextInt(arc-3)+1;
			int f= jk.nextInt(arc-3)+1;
			int g= jk.nextInt(arc-3)+1;
			int h= jk.nextInt(arc-3)+1;
			if(lookarray[c][d]==&&lookarray[f][g]==0){
				lookarray[c][d]=h;
				lookarray[f][g]=h;
				
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
		
		//show time button
		JLabel jl = new JLabel("Time:");
		
		jl.setBounds(440,700,80,50);
		
		f.add(jl);
		
		jl.setVisible(true);
		
		
		
		//show the remaining time
		JLabel timeJl = new JLabel("90");
		
		timeJl.setBounds(520,700,80,50);
		
		f.add(timeJl);
		
		timeJl.setVisible(true);
		
		
		
	    for (int i = 0; i < 2; i++) {
		    shooky[i] = new JK("JK.png");
			shooky[i].setX(jk.getX() +i * size + i * space);
			f.add(jk.getImg());

		}
	    f.add(mang.getImg());
	    
	
	    f.add(table.getImg());
		
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
