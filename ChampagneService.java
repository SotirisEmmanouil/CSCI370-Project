
public class ChampagneService extends RoomService {
	
	public ChampagneService(RoomService service) {
		super(service);			//WhiskeyService Constructor
		
	}

	@Override
	public double serviceCost() {
		double serviceCost = 0;
	        if(_RoomService != null)	
	        	//if room service cost is not null, return previous cost
	            serviceCost =  _RoomService.serviceCost();
	        return(serviceCost + 25.75);
		
	}

	@Override
	public String servicesList() {
	     String list="";
	        if(_RoomService != null)
	        //if room service list is not null, return previous service
	            list =  _RoomService.servicesList();
	        return(list + "Delivered Champagne ");
		
	}

	@Override
	public void deliver(String room) {
		   if(_RoomService != null)
		//if room service deliver is not null, return previous delivery
			   _RoomService.deliver(room);
	        System.out.println("Delivering Champagne to room "+room+" ");
		
	}
}
