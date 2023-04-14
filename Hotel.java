public class Hotel {
    private static Hotel instance;
    private int numberOfRooms;
    private int occupiedRooms;

    private Hotel() {
        numberOfRooms = 50; // Assuming the hotel has 50 rooms
        occupiedRooms = 0;
    }

    public static synchronized Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public void checkIn() {
        if (occupiedRooms < numberOfRooms) {
            occupiedRooms++;
            System.out.println("Room checked in. Occupied rooms: " + occupiedRooms);
        } else {
            System.out.println("No available rooms. Please try later.");
        }
    }

    public void checkOut() {
        if (occupiedRooms > 0) {
            occupiedRooms--;
            System.out.println("Room checked out. Occupied rooms: " + occupiedRooms);
        } else {
            System.out.println("No rooms to check out.");
        }
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }
}