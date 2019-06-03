import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
	
	int countTime=90;
	int secondTimer = 0;
	JLabel time= new JLabel ("countTime");
	
	Color c= new Color(210,250, 200);
	
	Table table = new Table("6x7 table.png");
	//create an array of shooky
	
	Picture[][] pics= new Picture[6][7];
	
	Picture test = new Picture("puppy.png");
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(10,180,140));
		
		
	}
	
	
	public void update(){
		secondTimer+=17; //update is being called every 17ms so time has to go up by 17ms
		
		 if(secondTimer>=1000){
			 countTime--;
			 secondTimer=0; //reset second counter
		 }
		 for(int count=90; count>=0; count--){
				time.setText("Count Down: " + countTime+" " );
	      }
	      if(countTime==0){
	    	  
	    	  t.stop();
	    	  
	      }
	      
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
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
		
		
		//show the remaining time
		
		time.setText("Count-Down: "+ countTime);
		
		
		time.setBounds(520,700,180,50);
		
		f.add(time);
		
		time.setVisible(true);
		
		
		/*for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("JK.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
			
		}
		
		for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("mang.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
		}
		
		for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("puppy.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
		}
		
		for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("RJ.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
		}
		
		for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("TATA.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
		}
		
		for(int i =0; i< 7; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			pics[r][c] = new Picture ("Squirrel.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			if(pics[r][c]==null){
				f.add(pics[r][c].getImg());
			}
			
		}*/

		f.add(test.getImg());
	  
	    f.add(table.getImg());
	    
		t = new Timer(17, this);
		// add a listener for startBUTTON
				startJB.addMouseListener(new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						
						t.start();
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}});
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
