public class HotelCheckIn {
    private Hotel hotel;

    public HotelCheckIn() {
        hotel = Hotel.getInstance();
    }

    public void performCheckIn() {
        hotel.checkIn();
    }
}