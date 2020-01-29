import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// room number needs to be declared and initialized to 1, maybe on gameStart?

public void room4() {
        this.roomName.put(4, "Kitchen.");
        this.items.put(4, "Bats");


        System.out.println("You have entered the: " + roomName.get(4));
        System.out.println("The item is : " + items.get(4));

        while (start) {
        System.out.println("Enter what room you want to enter: \n1.Front Room\n2. Parlor");
        int input = scan.nextInt();
        if (input == 1) {
            System.out.printlin("You are going to the Front Room")
            room2();
        }else if(input == 2){
            System.out.println("You are going to the Parlor")
            room7();
        }
        else if (input == 0) {
        exit();
        start = false;
        } else {
        System.out.println("Enter valid input");
        continue;
        }
     }
}
public void room5() {
        this.roomName.put(5, "Dining room");
        this.items.put(5, "Dust Empty Box");


        System.out.println("You have entered the: " + roomName.get(5));
        System.out.println("The item is : " + items.get(5));

        while (start) {
        System.out.println("Enter what room you want to enter: \n1. Library");
        int input = scan.nextInt();
        if (input == 1) {
        System.out.printlin("You are going to the Library")
        room2();
        }else if (input == 0) {
        exit();
        start = false;
        } else {
        System.out.println("Enter valid input");
        continue;
        }
     }
   }
public void room6() {
        this.roomName.put(6, "Vault");
        this.items.put(6, "3 Walking Skeletons");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("You have entered the: " + roomName.get(6));
        System.out.println("The item is : " + items.get(6));

        while (start) {
        System.out.println("Enter what room you want to enter: \n1. Parlor\n2. Secret Room");
        int input = scan.nextInt();
        if (input == 1 ) {
        System.out.printlin("You are going to the Parlor")
        room2();
        }else if(input == 2 && random.nextInt(100) + 1 >= 75){
        System.out.println("You are going to the Secret Room")
        room7();
        }else if (input == 0) {
        exit();
        start = false;
        } else {
        System.out.println("Enter valid input");
        continue;
        }
        }

