import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//author: Sotiris Emmanouil
class ServiceTest {

	@Test
	void test1() {
	RoomService service = new WhiskeyService(null);
	     service = new WineService(service);
		assertTrue(service.serviceCost()==85.75);
	//checks to see if price of whiskey and wine is truly $85.75
	}
	
	@Test
    void test2(){
    	RoomService service2 = new WhiskeyService(null);
	     service2 = new WineService(service2);
	 	assertTrue(service2.servicesList().equals("Delivered Whiskey Delivered Wine "));
    //checks to see if the list of ordered items is Wine and Whiskey
	}
}
