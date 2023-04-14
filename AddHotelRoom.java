
public class AddHotelRoom {
	private Price price;
	private Beds beds;
	private Theme theme;
	
	public AddHotelRoom(Price price, Beds beds, Theme theme) {
		this.price = price;
		this.beds = beds;
		this.theme = theme;
	}
	
	public String getHotelRoomPrice() { 
		return price.roomPrice();
	}
	
	public String getHotelRoomBeds() {
		return beds.roomBeds();
	}
	
	public String getHotelRoomTheme() {
		return theme.roomTheme();
	}
}

