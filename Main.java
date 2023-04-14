
public class Main {

	public static void main(String[] args) {
		AddHotelRoom singleRoom1 = new AddHotelRoom(new DoublePrice(), new SingleBed(), new StandardTheme());
		System.out.println(singleRoom1.getHotelRoomTheme());
		System.out.println(singleRoom1.getHotelRoomBeds());
		System.out.println(singleRoom1.getHotelRoomPrice());
	}

}
