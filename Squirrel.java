import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Squirrel {

	// field for a cat object
	private int x, y; // position
	private int w, h; // width and height
	private JLabel img; // holds image for object
	

	public Squirrel(String filename) {
		String src = new File("").getAbsolutePath() + "/src/";
		ImageIcon catIcon = new ImageIcon(src+filename);
		img = new JLabel(catIcon);

		w = 50;
		h = 50;
		x = 50;
		y = 140;
		
		img.setBounds(x, y, w, h);

	}
	
	public void setX (int x){
		this.x=x;
		img.setBounds(x,y,w,50);
	}
	
	public void setW(int newW) {
		w = newW;
	}

	public void setY(int newY) {
		y = newY;
	}
	

	public void setH(int newH) {
		h = newH;
	}

	public void setImg(JLabel newImg) {
		img = newImg;
	}

	public int getX() {
		return x;

	}

	public int getY() {
		return y;
	}

	public JLabel getImg() {
		return img;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	

	

 
}


	
	