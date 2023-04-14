/*This class allows the user to create new hotel rooms with features*/

public class AddHotelRoom {
	private Price price;
	private Beds beds;
	private Theme theme;
	
	public AddHotelRoom(Price price, Beds beds, Theme theme) { //creates the room with it's features
		this.price = price;
		this.beds = beds;
		this.theme = theme;
	}
	
	public String getHotelRoomPrice() { //retrieves room price
		return price.roomPrice();
	}
	
	public String getHotelRoomBeds() { //retrieves number of beds in the room
		return beds.roomBeds();
	}
	
	public String getHotelRoomTheme() { //retrieves the theme of the room
		return theme.roomTheme();
	}
}

