public class HotelCheckOut {
    private Hotel hotel;

    public HotelCheckOut() {
        hotel = Hotel.getInstance();
    }

    public void performCheckOut() {
        hotel.checkOut();
    }
}