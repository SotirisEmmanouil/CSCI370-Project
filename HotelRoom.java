
/**
 * @author Lauren Ramroop
 * A class that abstracts a hotel room, containing the name of the guest in it, the service 
 * requested, and the room number.
 */
public class HotelRoom{
   private String guestName, serviceType;
   private int roomNumber;

   public String getName(){
      return guestName;
   }

   public void setName(String name){
      this.guestName = name;
   }

   public String getService(){
      return serviceType;
   }

   public void setService(String serviceType){
      this.serviceType = serviceType;
   }

   public int getRoomNumber(){
      return roomNumber;
   }

   public void setRoomNumber(int newNumber){
      this.roomNumber = newNumber;
      
   }

   public String toString(){
      return "Name: " + guestName + " Service Request: " + serviceType + " Room Number: " + roomNumber;
   }
   
   public HotelRoom(String name, String service, int roomNumber){
      if (roomNumber < 100 || roomNumber > 999){
         throw new IllegalArgumentException("Invalid room number.");
      }else{
         this.guestName = name;
         this.serviceType = service;
         this.roomNumber = roomNumber;
      }
   }
}
