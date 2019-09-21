package a3;

public class ShortestWaitDispatcher implements Dispatcher{

	
	private Driver closestDriver;
	
	public	ShortestWaitDispatcher(){
		
		 
		
	}

	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		// TODO Auto-generated method stub
		closestDriver = availableDrivers[0];
		for(int i = 0; i < availableDrivers.length; i ++) {
			if(closestDriver.getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())
						> availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())) {
				
				closestDriver = availableDrivers[i];
				
			}
			
			
		}
		
		return closestDriver;
	}
}
