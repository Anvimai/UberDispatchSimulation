# Car and Driver

## Novice (7 points)

* Position
* Driver
* Vehicle
* RideRequest
* CompletedRide

Create the following classes which implement each of the interfaces above:
* PositionImpl
* DriverImpl
* VehicleImpl
* RideRequestImpl
* CompletedRideImpl

A few notes:
* For now, ignore the code in the interface Dispatcher and the classes Simulation and RoundRobinDispatcher
* The constructors and methods of your implementations should appropriately check all values
  for validity. In particular, any reference types (i.e., String, Position, Driver, etc.) provided
  as parameters should be checked against null. If a reference is null, throw a runtime exception
  as explained in class.
* Any interface methods that can be implemented as default methods should be. This will require
  you to change the interfaces themselves to include the default method definition. 
* You should get in the habit of writing testing code. For this assignment, I suggest writing 
  small test programs that exercises each of the implementation and confirms that things are
  working as you expect. Get in the habit of putting your testing code in a separate package than
  the code it is testing. I've included an example in the package a3test called PositionTest for
  testing PositionImpl.

## Adept (2 points)

* ShortestWaitDispatcher
  * This dispatcher should choose the driver that is closest to the client's position (i.e. will incur
    the shortest wait time.
  
* ShortButFairDispatcher
  * This dispatcher should choose the driver that is closest to the client's position but without
    considering the last five drivers chosen (you can assume that there will be more than five
    available drivers). In other words, if your dispatcher first chooses DriverA, then the next four
    times that the dispatcher is asked to choose a driver, DriverA should not be eligible for being
    chosen. 
  
## Jedi (1 point)

Update the code in Simulation to provide a more general constructor that allows one to specify
the grid dimensions, hotspot count, and driver count with the following form:
