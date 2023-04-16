
public abstract class RoomService {
	
	protected RoomService _RoomService;		// protected RoomService variable
	
	public RoomService(RoomService service) {	
		//RoomService constructor
		this._RoomService = service;
	}
	
	abstract public double serviceCost();	//calculate cost
	abstract public String servicesList();	//create a list of services provided
	abstract public void deliver(String room);			//show the service is being provided

}
