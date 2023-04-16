
public class Main {

	public static void main(String[] args) {
		int d;
		String room = null;
		System.out.println("Would you like some room service? Enter 1 for yes or any other digit for no");
		Scanner scan = new Scanner(System.in);
		d = scan.nextInt();
		
		if(d ==1){
			System.out.println("Enter 1 for whiskey, 2 for wine, 3 for champagne. Enter room number as well");	
			d = scan.nextInt();
			room = scan.next();
			
		
		if(d==1) {
			RoomService service = new WhiskeyService(null);
			 service.deliver(room);
		 System.out.println(service.serviceCost());
		}
		if(d==2) {
	       RoomService service = new WineService(null);
	      	service.deliver(room);
	      	System.out.println(service.serviceCost());
	   }
		if(d==3) {
			RoomService service = new ChampagneService(null);
			 service.deliver(room);
			 System.out.println(service.serviceCost());
		}
		
		}
		AddHotelRoom singleRoom1 = new AddHotelRoom(new DoublePrice(), new SingleBed(), new StandardTheme());
		System.out.println(singleRoom1.getHotelRoomTheme());
		System.out.println(singleRoom1.getHotelRoomBeds());
		System.out.println(singleRoom1.getHotelRoomPrice());
	}

}
