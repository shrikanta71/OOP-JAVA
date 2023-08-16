public class room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    public void setdata(int roomno, String roomtype, double roomarea, boolean ACmachine){
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    public void displaydata(){
        System.out.println("Room no: " + this.roomno + "\nRoom type: " + this.roomtype + "\nRoom area: " + this.roomarea + "\nAC: " + this.ACmachine);
    }

    public static void main(String[] args) {
        room obj = new room();

        obj.setdata(611, "Bad Room", 800, true);
        obj.displaydata();
    }
}
