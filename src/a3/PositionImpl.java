package a3;



public class PositionImpl implements Position {
	
	/* 
	 * Position
	 * Represents an integer (x,y) position on a grid.
	 *  
	 * getX()
	 *   Retrieves x coordinate of the position
	 *  
	 * getY()
	 *   Retrieves y coordinate of the position
	 *   
	 * getManhattanDistanceTo(Position p)
	 *   Calculates the "Manhattan" distance between two positions.
	 *   The Manhattan distance is simply the absolute difference in x positions
	 *   summed with the absolute difference in y positions.
	 */
	
	private int x;
	private int y;
	

	public PositionImpl(int x, int y) {
		this.x = x;
		this.y = y;
		

	}
	
	
	
	public int getX() {
		
		return x;
	}
	public int getY() {
		
		return y;
	}
	public int getManhattanDistanceTo(Position p) {
		
		int x = getX();
		int y = getY();
		int x2 = p.getX();
		int y2 = p.getY();
		
		
		return (Math.abs((x2) - (x)) + Math.abs((y2) - (y)));
	}

}
