package a3;

public class ShortestWaitDispatcher implements Dispatcher{

	private Driver closestDriver; 
	
	ShortestWaitDispatcher(){
		
		this.closestDriver = closestDriver; 
		
	}

	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		// TODO Auto-generated method stub
		for(int i = 0; i < availableDrivers.length; i ++) {
			if(closestDriver.getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())
						< availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())) {
				
				closestDriver = availableDrivers[i];
				
			}
			
			
		}
		
		return closestDriver;
	}
}
