 package a3;

public class RideRequestImpl implements RideRequest{
	
	private Position clientPosition;
	private Position destination;
	boolean comp = false; 
	Driver driver; 
	
	
	
	public RideRequestImpl(Position clientPosition, Position destination) {
		
		this.clientPosition = clientPosition; 
		this.destination = destination; 
		
		
		
	}

	@Override
	public Position getClientPosition() {
		// TODO Auto-generated method stub
		return clientPosition;
	}

	@Override
	public Position getDestination() {
		// TODO Auto-generated method stub
		return destination;
	}

	@Override
	public boolean getIsComplete() {
		// TODO Auto-generated method stub
		
		//boolean comp = false;
		
		
		
		return comp ;
	}

	@Override
	public CompletedRide complete( Driver driver) {
	// *    If the RideRequest has not yet been completed, the method should:
	//	 *    - update the request to indicate that the request has been completed,
	//	 *    - create a CompletedRide object that captures information about the
	//	 *      about the completed ride (see CompletedRide interface)
	//	 *    - move the vehicle of the driver to the position of the client and 
	//	 *      then move the vehicle to the destination of the ride,
	//	 *    - and finally return the CompletedRide object.
	//	 *    
	//	 *    If the RideRequest has already been completed, simply returns
	//	 *    the CompletedRide object describing the completed ride.		
		 
		
		if (this.getIsComplete()!=true) {
			
			
			
		comp = true;
		
		
		 CompletedRide initialRide = new CompletedRideImpl(this, driver);
		
			
		    driver.getVehicle().moveToPosition(clientPosition);
			driver.getVehicle().moveToPosition(destination);
			
		
		
	
			return initialRide;
			
			
	
		//move vehicle to client position
		//move vehicle to destination
		
	}
		

		
			
			return new CompletedRideImpl(this,driver);//new CompletedRideImpl(this, driver);
		
		
	
		
		
	}

	@Override
	public int getRideTime() {
		// TODO Auto-generated method stub
		
		return (Math.abs((clientPosition.getX()) - (destination.getX()))
					+ Math.abs((clientPosition.getY()) - ( destination.getY())));
		
	}
	
	
	
	/*
	 * RideRequest
	 * Represents a request by a client for a ride between their current
	 * position and some destination.
	 * 
	 * getClientPosition()
	 *    Retrieves the client position.
	 *    
	 * getDestination()
	 *    Retrieves the destination position.
	 *    
	 * getIsComplete()
	 *    Returns true if this request has been completed, false if not.
	 *    A new RideRequest starts off as not completed and becomes completed
	 *    if the complete method (see below) is invoked.
	 *    
	 * complete(Driver driver)
	 *    If the RideRequest has not yet been completed, updates the 
	 *    request to indicate that the request has been
	 *    completed and returns a CompletedRide object that captures
	 *    information about the completed ride (see CompletedRide interface).
	 *    
	 *    If the RideRequest has already been completed, simply returns
	 *    the CompletedRide object describing the completed ride.
	 *   
	 * getRideTime()
	 *    Returns the Manahattan distance between the client position and the
	 *    destination position as a measure of how long the requested ride
	 *    will take.
	 */
	
	
	

}
