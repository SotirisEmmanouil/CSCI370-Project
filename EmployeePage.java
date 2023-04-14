public class EmployeePage{

    public void notify(HotelRoom hotelRoom, boolean request){
        System.out.println(request ==true?"Room number " + hotelRoom.getRoomNumber() + " requires " + hotelRoom.getService(): "Request completed " + "for " + hotelRoom.getRoomNumber());
        System.out.println("Requested by: "+ hotelRoom.getName());

    }
}
