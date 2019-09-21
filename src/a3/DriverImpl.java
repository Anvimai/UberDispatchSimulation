package a3;

public class DriverImpl implements Driver {
	
	/*
	 * Driver
	 * Represents a driver associated with a vehicle.
	 * 
	 * getFirstName()
	 *    Retrieves first name of driver.
	 *    
	 * getLastName()
	 *    Retrieves last name of driver.
	 *    
	 * getFullName()
	 *    Retrieves full name of driver. This should be the first name followed
	 *    a single space followed by the last name.
	 * 
	 * getID()
	 *    Retrieves the ID number of the driver.
	 *    
	 * getVehicle()
	 *    Retrieves the Vehicle object associated with the driver.
	 *    
	 * setVehicle(Vehicle v)
	 *    Setter for the vehicle associated with the driver.
	 */
	
	private String firstName = "";
	private String lastName = "";
	
	private int idNumber =0;
	private Vehicle vehicle; 
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		
		this.firstName = first; 
		this.lastName = last;
		this.idNumber = id;
		this.vehicle = vehicle;
		
		if(first==null) {
			throw new RuntimeException("Empty first name value");
		}
		
		if(last==null) {
				throw new RuntimeException("Empty last name value");
		}
		
		if(id == 0) {
			throw new RuntimeException("Expected id input");
		}
		
		if(vehicle == null) {
			throw new RuntimeException("Expected vehicle input");
		}
		

	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		
		
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}



	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return idNumber;
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

	@Override
	public void setVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		
		vehicle = v; 
		System.out.println(v.getPlate());
		
	}

}
