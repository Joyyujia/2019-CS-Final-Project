
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Driver extends JFrame implements Lookconfig{
	
	private int[][] info = new int [8][8];

    JLabel time; //record time
    

	public static void main(String[] args) throws InterruptedException {
		GameLook g = new GameLook();
		
		g.showUI();
		

	}

}
