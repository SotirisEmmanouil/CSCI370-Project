public class App {
    public static void main(String[] args) throws Exception {
        HotelRequests hotelRequest = new HotelRequests();
        hotelRequest.addRequests(new HotelRoom("Mary Sue", "BATHROOM CLEANING", 101));
        hotelRequest.addRequests(new HotelRoom("John Cena", "EXTRA TOWELS",102));
        hotelRequest.removeRequests(new HotelRoom("Mary Sue", "BATHROOM CLEANING", 101));


    }
}
