import java.util.ArrayList;
import java.util.List;

//add hotel rooms to list that requires cleaning
public class HotelRequests{
    private List<HotelRoom> hotelRoomList = new ArrayList<>();
    private EmployeePage employeePage = new EmployeePage();

    //add when room is dirty 
    public void addRequests(HotelRoom hotelRoom){
        employeePage.notify(hotelRoom, true);
        hotelRoomList.add(hotelRoom);
    }

    //remove once cleaned
    public void removeRequests (HotelRoom hotelRoom){
        employeePage.notify(hotelRoom, false);
        hotelRoomList.remove(hotelRoom);
    }
}
