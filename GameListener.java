import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;


public class GameListener extends MouseAdapter implements LookConfig{ //keep track in the position
	
	private boolean flag= true;
	
	private int r1, c1, r2, c2; //position of the pictures
	
	private int x1,y1,x2,y2; // keep track in the mouse position
	
	private int array[][]; //save the position 
	
	private JFrame frame; //get the data using JFrame
	
	private Graphics2D g;
	
	private JLabel JL;
	
	JLabel time;//showing the remaining time
	TimeOut tt;
	
	
	//may need to implement TimeOut object to record the remaining time
	
	private int x, y; //save the position of x and y
	public TimeOut getTt(){
		return tt;
		
	} 
	public void setIt(TimeOut tt){
		this.tt=tt;
		
	} 
	public void setTimeJl(JLabel time){
		this.time = time;
		
	}
	

	public void setFrame(JFrame frame) {
		this.frame =frame;
		g=(Graphics2D)frame.getGraphics();
		
		
	}
	
	public void setArray(int[][]array){
		this.array = array;
		
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		
		if(flag){
			x1 = e.getX() -40;
			y1 = e.getY() -50; //get the mouse position
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
		 GameSettings gu = new GameSettings(this.frame);
        if (array[r1][c1] == array[r2][c2] && flag && !(r1 == r2 && c2 == c1)
                && (array[r1][c1] != 0 || array[r2][c2] != 0)) {
            if (gu.sit1(r1, c1, r2, c2, array)) {
                array[r1][c1] = 0;
                array[r2][c2] = 0;
                g.setColor(Color.PINK);
                g.drawLine(2 * space + size / 2 + c2 * (size + space) + 40,
                        size + size / 2 + r2 * (size + space) + 50, 2 * space
                                + size / 2 + c1 * (size + space) + 40, size
                                + size / 2 + r1 * (size + space) + 50);

            } else if (gu.sit2(r1, c1, r2, c2, array)) {
                array[r1][c1] = 0;
                array[r2][c2] = 0;
                g.setColor(Color.PINK);
                g.drawLine(2 * space + size / 2 + gu.getPath().get(0).y
                        * (size + space) + 40, size + size / 2
                        + gu.getPath().get(0).x * (size + space) + 50, 2
                        * space + size / 2 + c1 * (size + space) + 40, size
                        + size / 2 + r1 * (size + space) + 50);
                g.drawLine(2 * space + size / 2 + gu.getPath().get(0).y
                        * (size + space) + 40, size + size / 2
                        + gu.getPath().get(0).x * (size + space) + 50, 2
                        * space + size / 2 + c2 * (size + space) + 40, size
                        + size / 2 + r2 * (size + space) + 50);

            } else if (gu.sit3(r1, c1, r2, c2, array)) {
                array[r1][c1] = 0;
                array[r2][c2] = 0;
                g.setColor(Color.PINK);
                g.drawLine(2 * space + size / 2 + gu.getPath().get(1).y
                        * (size + space) + 40, size + size / 2
                        + gu.getPath().get(1).x * (size + space) + 50, 2
                        * space + size / 2 + c1 * (size + space) + 40, size
                        + size / 2 + r1 * (size + space) + 50);
               
                g.drawLine(2 * space + size / 2 + (gu.getPath().get(0).y - 1)
                        * (size + space) + 40, size + size / 2
                        + (gu.getPath().get(0).x - 1) * (size + space) + 50, 2
                        * space + size / 2 + gu.getPath().get(1).y
                        * (size + space) + 40, size + size / 2
                        + gu.getPath().get(1).x * (size + space) + 50);
                g.drawLine(2 * space + size / 2 + (gu.getPath().get(0).y - 1)
                        * (size + space) + 40, size + size / 2
                        + (gu.getPath().get(0).x - 1) * (size + space) + 50, 2
                        * space + size / 2 + c2 * (size + space) + 40, size
                        + size / 2 + r2 * (size + space) + 50);
            }
		 Thread t=new Thread();
            try {
                t.sleep(100);
                frame.repaint();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
	 if (isWin(array)) {
                tt.setFlag(false);
                frame.removeMouseListener(this);
                JOptionPane.showMessageDialog(frame, "Congras，"
                        + "You win！！Please press game for a new game");
                int i = JOptionPane.showConfirmDialog(frame, "do you want to save your score in the rank",
                        "Ranking", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    String str = JOptionPane.showInputDialog(frame, "Please enter your name ",
                            "Ranking", JOptionPane.YES_NO_OPTION);
                    int time=90-tt.getSeconds();
                    User u = new User(str, time);
                    GameSave gs = new GameSave();
                    gs.save(u);
                }
            }
        }
    
        if (flag) {
            Thread t=new Thread();
            try {
                t.sleep(100);
                frame.repaint();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }
	 public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if ("New Game".equals(str)) {
            for (int r = 0; r < array.length; r++)
                for (int c = 0; c < array[r].length; c++)
                    if (array[r][c] != 0) {
                        array[r][c] = 0;
                    }
            if(tt!=null){
                if(tt.isFlag()){
                    frame.removeMouseListener(this);
                    tt.setFlag(false);
                }
            }
//            randomData();
            frame.repaint();
            frame.addMouseListener(this);
   
            tt = new TimeOut(JL, frame, this);
            if(!tt.isFlag())
                tt.setFlag(false);
            tt.start();
        }
       

    public boolean isWin(int[][] array) {
        for (int r = 0; r < array.length; r++)
            for (int c = 0; c < array[r].length; c++)
                if (array[r][c] != 0)
                    return false;
        return true;
    }
