public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;
    public Room(){
        System.out.println("Hello, an object name Room have been created.");
    }
    public Room(int roomno, String roomtype, float roomarea, boolean ACmachine){
        this.roomno=roomno;
        this.roomtype=roomtype;
        this.roomarea= roomarea;
        this.ACmachine=ACmachine;
    }
    public void displayData(){
       System.out.println("Room no :" +this.roomno);
       System.out.println("Room type :" +this.roomtype);
       System.out.println("Room area :" +this.roomarea);
       System.out.println("ACmachine :" +this.ACmachine);
    }
    public static void main(String[] args) {
        Room R1=new Room();
        Room R2=new Room(814,"Lab",50.5f,false);
        R2.displayData();
    }
}