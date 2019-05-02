import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameLook extends JFrame implements Lookconfig{
	
	private int[][] info = new int [8][8];
	
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
		
		//show remaining time
		JLabel jl = new JLabel("Time:");
		
		jl.setBounds(440,700,80,50);
		
		this.add(jl);
		
		
		JLabel timeJl = new JLabel("90");
		
		
		
		
		
	}

	

}
