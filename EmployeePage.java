public class EmployeePage{
    /**
     * @author Lauren Ramroop
     * Designed to give notification to listener (employee) based on if a request is added or removed
     * @param hotelRoom the hotel room requesting a service
     * @param request shows if request is being added (true) or removed (false)
     */
    public void notify(HotelRoom hotelRoom, boolean request){
        System.out.println(request ==true?hotelRoom.getName() + " in room number " + hotelRoom.getRoomNumber() + " requires " + hotelRoom.getService()
            : "Request completed for room " + hotelRoom.getRoomNumber());

    }
}

