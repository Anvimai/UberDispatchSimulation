package a3;

public class VehicleImpl implements Vehicle {
	
	/*
	 * Vehicle
	 * Represents a vehicle in our system.
	 * 
	 * getMake()
	 *    Retrieves the make of the vehicle.
	 *    
	 * getModel()
	 *    Retrieves the model of the vehicle.
	 *    
	 * getPlate()
	 *    Retrieves the license plate of the vehicle.
	 *    
	 * getMileage()
	 *    Retrieves the total distance the vehicle has traveled
	 *    up to now. Think of this like its "odometer".
	 *    
	 * getPosition()
	 *    Retrieves the current position of the vehicle.
	 *    
	 * moveTo(Position p)
	 *    Updates the mileage of the vehicle by adding the Manhattan
	 *    distance between the vehicle's current position and the
	 *    position p passed in as a parameter. Then updates the 
	 *    vehicle's current position to be p.
	 */
	
	private	 String make = "";
	private String model = "";
	private String plate = "";
	private Position position;
	int mileage = 0;
	
	public VehicleImpl(String make, String model, String plate, Position position) {
	 this.make = make; 
	 this.model = model;
	 this.plate = plate; 
	 this.position = position;
		
		
	}
	
	public String getMake() {
		
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getPlate() {
		return plate;
	}
	public int getMileage() {
		return 0;
	}
	public Position getPosition() {
		return position;
		
		
	}
	public void moveToPosition(Position p) {
		
		int x = position.getX();
		int y = position.getY();
		int x2 = p.getX();
		int y2 = p.getY();
		
		
		 mileage = (Math.abs(( p.getX()) - (position.getX())) + Math.abs((y2) - (position.getY())));
		 position = p;
		 
		//System.out.println(mileage);
		//System.out.print(p.getX()); System.out.println(p.getY());
	}

}
