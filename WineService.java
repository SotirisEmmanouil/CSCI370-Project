
public class WineService extends RoomService {
	
	public WineService(RoomService service) {
		super(service);			//whiskeyService Constructor
		
	}

	@Override
	public double serviceCost() {
		double serviceCost = 0;
	        if(_RoomService != null)	
	        	//if room service cost is not null, return previous cost
	            serviceCost =  _RoomService.serviceCost();
	        return(serviceCost + 35.50);
		
	}

	@Override
	public String servicesList() {
	     String list="";
	        if(_RoomService != null)
	        //if room service list is not null, return previous service
	            list =  _RoomService.servicesList();
	        return(list + "Delivered Wine ");
		
	}

	@Override
	public void deliver(String room) {
		   if(_RoomService != null)
		//if room service deliver is not null, return previous delivery
			   _RoomService.deliver(room);
	        System.out.println("Delivering wine to:"+ room +" ");
		
	}
}
