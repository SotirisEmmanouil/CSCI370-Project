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
   public HotelRoom(String name, String service, int roomNumber){
      this.guestName = name;
      this.serviceType = service;
      this.roomNumber = roomNumber;
   }

}
