import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameLook extends JFrame implements Lookconfig{
	
	private int[][] info = new int [8][8];
	
	JLabel time;

	public void showUI() throws InterruptedException {
		setTitle("Picture Matching");
		setSize(700,800);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setResizable(true);
		setLayout(null);
		
		
		
	}

	

}