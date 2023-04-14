import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddHotelRoomTest {

	@Test
	void testPrice() { //tests the room price
		AddHotelRoom room = new AddHotelRoom(new SinglePrice(), new SingleBed(), new StandardTheme());
		assertTrue(room.getHotelRoomPrice() == "This room costs $70 per night.");
	}
	
	
	@Test
	void testTheme() { //tests the room theme
		AddHotelRoom room = new AddHotelRoom(new VIPPrice(), new DoubleBed(), new VIPTheme());
		assertTrue(room.getHotelRoomTheme() == "This is a VIP Suite.");
	}

}
