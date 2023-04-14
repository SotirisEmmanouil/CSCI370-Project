public class Main {
    public static void main(String[] args) {
        int d;
		String room = null;
        //DAYMON's Code - Start
        //Check-in
        HotelCheckIn hotelCheckIn = new HotelCheckIn();
        hotelCheckIn.performCheckIn();

        //Check-out
        HotelCheckOut hotelCheckOut = new HotelCheckOut();
        hotelCheckOut.performCheckOut();
        //DAYMON's Code - End
        
        //Sotiris' example code
        System.out.println("Would you like some room service? Enter 1 for yes or any other digit for no");
		Scanner scan = new Scanner(System.in);
		d = scan.nextInt();
		
		if(d ==1){
			System.out.println("Enter 1 for whiskey, 2 for wine, 3 for champagne. Enter room number as well");	
			d = scan.nextInt();
			room = scan.next();
			
		}
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
}
