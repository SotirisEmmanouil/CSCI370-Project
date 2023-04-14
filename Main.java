
public class Main {

	public static void main(String[] args) {
		AddHotelRoom singleRoom = new HotelRoom(new DoublePrice(), new SingleBed(), new StandardTheme());
		singleRoom.hotelRoomTheme();
		singleRoom.hotelRoomBeds();
		singleRoom.hotelRoomPrice();

	}

}
