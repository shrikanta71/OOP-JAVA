public class Room
{
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;

    Room()
    {
        System.out.println("Hello, an object of Room class is created.");
    }

    Room(int rno, String rtype, float rarea, boolean AC)
    {
        this.roomno = rno;
        this.roomtype = rtype;
        this.roomarea = rarea;
        this.ACmachine = AC;
    }

    void displayData()
    {
        System.out.println("Room No: " + roomno + "\nRoom Type: " + roomtype + "\nRoom Area: " +  roomarea + "\nAC Machine: " +  ACmachine);
    }

    public static void main(String[] args)
    {
        Room obj1 = new Room();
        Room obj2 = new Room(814, "Lab", 2400f, false);

        obj2.displayData();
    }
}
