package a3;

public class CompletedRideImpl implements CompletedRide {
	
	/*
	 * CompletedRide
	 * Represents information about how a specific ride request was completed.
	 * 
	 * getRequest()
	 *    Returns the RideRequest associated with this completed ride.
	 *    
	 * getDriver()
	 *    Returns the Driver associatd with this completed ride.
	 *    
	 * getWaitTime()
	 *    Returns the Manhattan distance between the position of the driver's vehicle
	 *    and the position of the client making the request at the time that the
	 *    ride was completed. This is intended to be a measure of how long the
	 *    client needed to wait for the driver to arrive.
	 *    
	 * getTotalTime()
	 *    The sum of the wait time and the ride time associated with the ride request.
	 * 
	 * getCost()
	 *    Calculates the cost of providing the ride. This cost is calculated as
	 *    one-half of the ride time summed with one-tenth of the wait time. 
	 *    Note: while wait and ride times are integer values, cost is a real value.
	 *    
	 * getPrice()
	 *    Calculates the price charged for the ride. This price is a function
	 *    of the ride time based on the wait time as follows:
	 *    
	 *    Wait Time		Price of Ride
	 *    < 25			two and one-half times the ride time
	 *    25 to 49		twice the ride time
	 *    50 to 99		equal to ride time
	 *    >= 100		half of ride time
	 *  
	 * getProfit()
	 *    Calculates the profit (or potentially the loss) generated by 
	 *    the completed ride. This is simply cost subtracted from price.
	 */

	private RideRequest request;
	private Driver driver;
	private Position initialPosition; 
	
	public CompletedRideImpl(RideRequest request, Driver driver) {
		
		this.request = request; 
		this.driver = driver; 
		this.initialPosition = driver.getVehicle().getPosition();  
		
	}
	
	
	@Override
	public RideRequest getRequest() {
		// TODO Auto-generated method stub
		return request;
	}

	@Override
	public Driver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	@Override
	public int getWaitTime() {
		// TODO Auto-generated method stub
		
		
		return (this.initialPosition.getManhattanDistanceTo(request.getClientPosition()));
		
		
	}

	@Override
	public int getTotalTime() {
		// TODO Auto-generated method stub

	
		return  (this.initialPosition.getManhattanDistanceTo(request.getClientPosition()))
						+	(this.request.getClientPosition().getManhattanDistanceTo(request.getDestination()));
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		// Calculates the cost of providing the ride. This cost is calculated as
		//one-half of the ride time summed with one-tenth of the wait time. 
		//Note: while wait and ride times are integer values, cost is a real value.
		
		return (((this.getTotalTime()-this.getWaitTime())/2.0) + (this.getWaitTime()/10.0));
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		//Calculates the price charged for the ride. This price is a function
		//of the ride time based on the wait time as follows:
		//Wait Time		Price of Ride
		//< 25			two and one-half times the ride time
		//25 to 49		twice the ride time
		//50 to 99		equal to ride time
		// >= 100		half of ride time
		
		if(this.getWaitTime()<25) {
			return (this.getTotalTime()-this.getWaitTime())*2.5;
		}
		if(this.getWaitTime()>= 25 && this.getWaitTime()<=49) {
			return (this.getTotalTime()-this.getWaitTime())*2.0;
		}
		if(this.getWaitTime()>= 50 && this.getWaitTime()<=99) {
			return (this.getTotalTime()-this.getWaitTime()); 
		}
		if(this.getWaitTime()>=100) {
			return (this.getTotalTime()-this.getWaitTime())/2.0;
		}
		return 0; 
		
	}

	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		if(this.getWaitTime()<25) {
			return (((this.getTotalTime()-this.getWaitTime())*2.5)
						-(((this.getTotalTime()-this.getWaitTime())/2.0) + (this.getWaitTime()/10.0)));
		}
		if(this.getWaitTime()>= 25 && this.getWaitTime()<=49) {
			return (((this.getTotalTime()-this.getWaitTime())*2.0)
						-(((this.getTotalTime()-this.getWaitTime())/2.0)+(this.getWaitTime()/10.0)));
		}
		if(this.getWaitTime()>= 50 && this.getWaitTime()<=99) {
			return ((this.getTotalTime()-this.getWaitTime())
						-(((this.getTotalTime()-this.getWaitTime())/2.0)+this.getWaitTime()/10.0)); 
		}
		if(this.getWaitTime()>=100) {
			return (((this.getTotalTime()-this.getWaitTime())/2.0)
						-(((this.getTotalTime()-this.getWaitTime())/2.0)+this.getWaitTime()/10.0));
		}
		return 0; 
		
	}

}
