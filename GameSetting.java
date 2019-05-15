import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

import javax.swing.JFrame;



public class GameSetting implements Lookconfig{
	private List <Point> path= new ArrayList<Point>();
	
	public GameSetting(JFrame frame){
		
	}
	
	public List<Point> getPath(){
		return path;
	}

}
