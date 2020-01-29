import java.util.HashMap;
import java.util.Scanner;

public class Room {
    HashMap<Integer, String> items = new HashMap<Integer, String>();
    HashMap<Integer, String> roomNum = new HashMap<Integer, String>();
    HashMap<Integer, String[]> chooseRoom = new HashMap<Integer, String[]>();

    room2(roomnum1)



    public  int room1(int roomNum){
        HashMap<Integer, String> roomName = new HashMap<Integer, String>();
        roomName.put(1, "Foyer");
        this.items.put(1, "Dead Scorpion");

        System.out.println("You have entered room: " + roomName);
        System.out.println("The item is : " + items.get(1));
        return roomNum;

        chooseRoom.put("N")
                input = sc.nextInt();
                if(input = 2){
                   room = 2;
                } else {
                    System.out.println("Please enter a valid room number.");
                }

}
       public int room2(int roomnum)


  public int room7(int roomNum){
      HashMap<Integer, String> roomName = new HashMap<Integer, String>();
      roomName.put(7, "Parlor");
      this.items.put(7, "Treasure Chest");

      // is String easier than String[] ??
      chooseRoom.put(7, "to the west, room 6;  to the east, room 8; to the south, room 4");

      System.out.println("You have entered room: " + roomName);
      System.out.println("The item is : " + items.get(1));
      System.out.println("You see " + chooseRoom);

      // how do I initialize the room variable? int room; ??
      // this control flow needs the Random variable
      // if Random variable chosen, then Secret Room
      Scanner sc = new Scanner(System.in);
      int input;
      input = sc.nextInt();
      if(input == 6) {
          room = 6;
      } else if (input == 4) {
          room = 4;
      } else if (input == 8){ // && /* random num 26-100) */{
          room = 8;
      } else {
          System.out.println("Please enter a valid room number.");
      } return roomNum;
  }


       public int room8(int roomNum){
       HashMap<Integer, String> roomName = new HashMap<Integer, String>();
       roomName.put(7, "Secret Room");
       this.items.put(7, "Piles of Gold");

       // is String easier than String[] ??
       chooseRoom.put(7, "to the west, room 6");

       System.out.println("You have entered room: " + roomName);
       System.out.println("The item is : " + items.get(1));
       System.out.println("You see " + chooseRoom);

       // how do I initialize the room variable? int room; ??

       Scanner sc = new Scanner(System.in);
       int input;
       input = sc.nextInt();
       if(input == 6) {
           room = 6;
       } else {
           System.out.println("Please enter a valid room number.");
       }
       return roomNum;
       }
   }
}