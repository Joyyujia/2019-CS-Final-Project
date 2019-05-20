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
	
	//check if the two selected images can be connected by a line 
	//Situation 1: the two pictures are in the same row or column
	public boolean sit1(int r1, int c1, int r2, int c2, int[][]array){
		if(r1!= r2&& c1!=c2){
			return false;
		}
		if(r1==r2){ //two images are in the same row
			if(c1==c2-1 || c2==c1-1){ //and in adjacent columns
				return true;
			}
			for(int i=Math.min(c1, c2)+1; i<Math.max(c1, c2); i++){
				if(array[r1][i]!=0){ //return false if there is an obstacle between 
					                 //two images
					return false;
				}
			}
		}
		else if(c1==c2){ // two images are in the same column
			if(r1==r2-1 || r2==r1-1){
				return true;
			}
			for(int i= Math.min(r1, r2)+1; i<Math.max(r1,r2); i++){
				if(array[i][c1]!=0){
					return false;
				}
			}
			
		}
		return true;
	}
	
	
	//Situation 2: two pictures are on a diagonal line
	//need to check situation 1 twice
	public boolean sit2 (int r1, int c1, int r2, int c2, int[][]array){
		if(r1==r2&&c1==c2){
			return false;
		}
		
		//test diagonal lines
		if(array[r1][c2]==0){
			boolean test1 = sit1 (r1, c1, r1, c2,array); //check if there is obstacles 
			                                             // on the horizontal direction
			boolean test2 = sit1 (r1, c2, r2, c2,array); //check obstacles on the vertical direction
			if(test1 && test2){
				path.add(new Point(r1,c2));
				return true;
			}
			
			
		}
		
		if(array[r2][c1]==0){
			boolean test1 =sit1 (r2, c1, r2, c2,array); //check  obstacles 
			boolean test2 =sit1 (r1, c1, r2, c1,array);
			
			if(test1&&test2){
				path.add(new Point(r2,c1));
				return true;
			}
		}
		
		
		return false;
		
	}
	
	//Situation 3: check situation 2 twice
	
	public boolean sit3 (int r1, int c1, int r2, int c2, int[][]array){
	 
		int[][] newArr= new int[array.length+2][array[0].length+2];
		
		for( int r=0; r<array.length; r++){
			for(int c=0; c<array[r].length; c++){
				newArr[r+1][c+1]= array [r][c];
				//add elements in given array to the new array
			}
		}
		
		for(int i=r1+2; i <newArr.length; i++){ //check horizontal direction between two images
			
			if(newArr[i][c1+1] ==0){
				if(sit2(r2+1,c2+1,i,c1+1,newArr)){
					path.add(new Point(i-1,c1));
					return true;
				}
			}else{
				break;
			}
			
		}
		
		return false;
	}
	
	
	

}
