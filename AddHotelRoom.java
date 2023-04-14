
public class AddHotelRoom {
	private Price price;
	private Beds beds;
	private Theme theme;
	
	public AddHotelRoom(Price price, Beds beds, Theme theme) {
		this.price = price;
		this.beds = beds;
		this.theme = theme;
	}
	
	public void hotelRoomPrice() { 
		price.roomPrice();
	}
	
	public void hotelRoomBeds() {
		beds.roomBeds();
	}
	
	public void hotelRoomTheme() {
		theme.roomTheme();
	}
}
