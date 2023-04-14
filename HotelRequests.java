import java.util.ArrayList;
import java.util.List;

/**
 * @author Lauren Ramroop
 * A class that adds and removes requests, and notifies listener 
 */
public class HotelRequests{
    private List<HotelRoom> hotelRoomList = new ArrayList<>();
    private EmployeePage employeePage = new EmployeePage();
 
    public void addRequests(HotelRoom hotelRoom){
        employeePage.notify(hotelRoom, true);
        hotelRoomList.add(hotelRoom);
    }

    public void removeRequests (HotelRoom hotelRoom){
        employeePage.notify(hotelRoom, false);
        hotelRoomList.remove(hotelRoom);
    }
}
