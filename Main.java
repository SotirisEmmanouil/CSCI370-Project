public class Main {
    public static void main(String[] args) {
        // Perform hotel check-in
        HotelCheckIn hotelCheckIn = new HotelCheckIn();
        hotelCheckIn.performCheckIn();

        // Perform hotel check-out
        HotelCheckOut hotelCheckOut = new HotelCheckOut();
        hotelCheckOut.performCheckOut();
    }
}