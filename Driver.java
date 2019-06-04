import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	private boolean flag = true;
	private int r1, c1, r2, c2;//complement to the array
	private int x1, y1, x2, y2;
	private int array[][];
	private JFrame frame;
			
	int countTime=45;
	int secondTimer = 0;
	JLabel time= new JLabel ("countTime");
	
	Color c= new Color(210,250, 200);
	
	Table table = new Table("6x7 table.png");
	//create an array of shooky
	
	Picture[][] pics= new Picture[6][7];
	
	Picture test = new Picture("puppy.png");
	
	GameOver go = new GameOver("Result.jpg");
	
	Instructions instruction = new Instructions("Instruction Page.png");
	
	Graphics2D g;
	private int x, y;
	
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
	    	  go.getImg().setVisible(true);
	    	  table.getImg().setVisible(false);
	    	  
	    	  for(int r=0; r<6;r++){
	    		  for(int c=0;c<7;c++){
	    			  pics[r][c].getImg().setVisible(false);
	    		  }
	    	  }
	    	  
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
		f.addMouseListener(this);
		
	for(int i =0; i< 6; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				
			}
			
			pics[r][c] = new Picture ("JK.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
			
			
				f.add(pics[r][c].getImg());
	
			
			
		}
		
		for(int i =0; i< 6; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				 
			}
			
			pics[r][c] = new Picture ("mang.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
				f.add(pics[r][c].getImg());
			
			
		}
		
		for(int i =0; i< 8; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				 
			}
			pics[r][c] = new Picture ("puppy.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
				f.add(pics[r][c].getImg());
			
			
		}
		
		for(int i =0; i< 8; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				 
			}
			pics[r][c] = new Picture ("RJ.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
				f.add(pics[r][c].getImg());
			
			
		}
		
		for(int i =0; i< 6; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				 
			}
			pics[r][c] = new Picture ("TATA.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
		
				f.add(pics[r][c].getImg());
			
			
		}
		
		for(int i =0; i< 6; i++){
			int r=(int)(Math.random()*6);
			int c=(int)(Math.random()*7);
			while(pics[r][c]!=null){
				 r=(int)(Math.random()*6);
				 c=(int)(Math.random()*7);
				 
			}
			pics[r][c] = new Picture ("Squirrel.png");
			pics[r][c].setX(pics[r][c].getX() +r * (size + space));
			pics[r][c].setY(pics[r][c].getY() +c * (size + space));
			
				f.add(pics[r][c].getImg());
			
			
		}
		
		
        instruction.getImg().setVisible(true);
		f.add(instruction.getImg());
		
		
		table.getImg().setVisible(false);
	    f.add(table.getImg());
	    
	    go.getImg().setVisible(false);
	    f.add(go.getImg());
	    
	    
	    
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
						
						table.getImg().setVisible(true);
						
						instruction.getImg().setVisible(false);
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
		if (flag) {
			x1 = e.getX() - 40;
			y1 = e.getY() - 50;
			flag = false;
			if (y1 / (size + space) - 1 >= array.length)
				r1 = array.length - 1;
			else if (y1 / (size + space) - 1 < 0)
				r1 = 0;
			else
				r1 = y1 / (size + space) - 1;
			if (x1 / (size + space) >= array[0].length)
				c1 = array[0].length - 1;
			else
				c1 = x1 / (size + space);
			g.setColor(Color.RED);
			g.setStroke(new BasicStroke(5));
			x = space + space + c1 * (size + space) + 40;
			y = size + r1 * (size + space) + 50;
			g.drawRect(x, y, size, size);
		} else {
			x2 = e.getX() - 40;
			y2 = e.getY() - 50;
			flag = true;
			if (y2 / (size + space) - 1 >= array.length)
				r2 = array.length - 1;
			else if (y1 / (size + space) - 1 < 0)
				r1 = 0;
			else
				r2 = y2 / (size + space) - 1;
			if (x2 / (size + space) >= array[0].length)
				c2 = array[0].length - 1;
			else
				c2 = x2 / (size + space);
			g.setColor(Color.RED);
			g.setStroke(new BasicStroke(4));
			x = space + space + c2 * (size + space) + 40;
			y = size + r2 * (size + space) + 50;
			g.drawRect(x, y, size, size);
		}
		GameSetting gs = new GameSetting(this.frame);
		if (array[r1][c1] == array[r2][c2] && flag && !(r1 == r2 && c2 == c1)
				&& (array[r1][c1] != 0 || array[r2][c2] != 0)) {
			if (gs.sit1(r1, c1, r2, c2, array)) {
				array[r1][c1] = 0;
				array[r2][c2] = 0;
				g.setColor(Color.PINK);
				g.drawLine(2 * space + size / 2 + c2 * (size + space) + 40,
						size + size / 2 + r2 * (size + space) + 50, 2 * space
								+ size / 2 + c1 * (size + space) + 40, size
								+ size / 2 + r1 * (size + space) + 50);

			} else if (gs.sit2(r1, c1, r2, c2, array)) {
				array[r1][c1] = 0;
				array[r2][c2] = 0;
				g.setColor(Color.PINK);
				g.drawLine(2 * space + size / 2 + gs.getPath().get(0).y
						* (size + space) + 40, size + size / 2
						+ gs.getPath().get(0).x * (size + space) + 50, 2
						* space + size / 2 + c1 * (size + space) + 40, size
						+ size / 2 + r1 * (size + space) + 50);
				g.drawLine(2 * space + size / 2 + gs.getPath().get(0).y
						* (size + space) + 40, size + size / 2
						+ gs.getPath().get(0).x * (size + space) + 50, 2
						* space + size / 2 + c2 * (size + space) + 40, size
						+ size / 2 + r2 * (size + space) + 50);

			} else if (gs.sit3(r1, c1, r2, c2, array)) {
				array[r1][c1] = 0;
				array[r2][c2] = 0;
				g.setColor(Color.PINK);
				g.drawLine(2 * space + size / 2 + gs.getPath().get(1).y
						* (size + space) + 40, size + size / 2
						+ gs.getPath().get(1).x * (size + space) + 50, 2
						* space + size / 2 + c1 * (size + space) + 40, size
						+ size / 2 + r1 * (size + space) + 50);
				
				g.drawLine(2 * space + size / 2 + (gs.getPath().get(0).y - 1)
						* (size + space) + 40, size + size / 2
						+ (gs.getPath().get(0).x - 1) * (size + space) + 50, 2
						* space + size / 2 + gs.getPath().get(1).y
						* (size + space) + 40, size + size / 2
						+ gs.getPath().get(1).x * (size + space) + 50);
				g.drawLine(2 * space + size / 2 + (gs.getPath().get(0).y - 1)
						* (size + space) + 40, size + size / 2
						+ (gs.getPath().get(0).x - 1) * (size + space) + 50, 2
						* space + size / 2 + c2 * (size + space) + 40, size
						+ size / 2 + r2 * (size + space) + 50);
			}
			Thread t=new Thread();
			try {
				Thread.sleep(100);
				//frame.repaint();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (flag) {
			Thread t1=new Thread();
			try {
				Thread.sleep(100);
				frame.repaint();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
	


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
