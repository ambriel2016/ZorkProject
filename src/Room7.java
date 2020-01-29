import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Room7 {

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
        Random random = new Random();
        int input;
        input = sc.nextInt();
        if(input == 6) {
            room = 6;
        } else if (input == 4) {
            room = 4;
        } else if (input == 8 && random.nextInt(100) + 1 >= 75){ // && /* random num 26-100) */
            room = 8;
        } else {
            System.out.println("Please enter a valid room number.");
        } return roomNum;
    }


}
