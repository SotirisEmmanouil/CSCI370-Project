public class Main {
    public static void main(String[] args) {
        //DAYMON's Code - Start
        //Check-in
        HotelCheckIn hotelCheckIn = new HotelCheckIn();
        hotelCheckIn.performCheckIn();

        //Check-out
        HotelCheckOut hotelCheckOut = new HotelCheckOut();
        hotelCheckOut.performCheckOut();
        //DAYMON's Code - End
    }
}
