package com.company;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Room {
    int roomNumChoice;
    int input;
    static boolean start = true;
    static Scanner scan = new Scanner(System.in);

    Random random = new Random();
    HashMap<Integer, String> items = new HashMap<Integer, String>();
    HashMap<Integer, String> roomName = new HashMap<Integer, String>();


    public Room() {
        room1();
    }

    public void exit() {
        System.out.println("You have exited the game");
        if (random.nextInt(100) + 1 >= 75) {
            System.out.println("Ghost is following you");
        }
    }

    public void checkInput () {
        boolean correctInput = false;
//        System.out.println("Please enter a room number: ");
        while (correctInput == false) {
        try {
            correctInput = true;
            input = scan.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("That is not an integer, please try again.");
            correctInput = false; // if the programs steps into the catch block here, it must mean they gave me a wrong input
            scan.nextLine(); // this is to clear scanner buffer
            continue; // go to next iteration of loop
        }
    }
  }

    public void room1() {
        this.roomName.put(1, "Foyer");
        this.items.put(1, "Dead Scorpion");
        while (start) {

            System.out.println("Please enter a room number: ");
            System.out.println(" \n1. Front Room\n0. Exit");
            checkInput();

           //input = scan.nextInt();
            if (input == 1) {
                room2();

            } else if (input == 0) {
                exit();
                start = false;

            } else {
              continue;
            }
        }
        System.out.println("You have entered room: " + roomName.get(1));
        System.out.println("The item is : " + items.get(1));
    }

    public void room2() {

        this.roomName.put(2, "Front Room");
        this.items.put(2, "Dead Scorpion");
        while (start) {

            System.out.println("You have enter the following rooms: " +
                    "\n1. Go back \n2. Library \n3. Kitchen");
            checkInput();
//           input = scan.nextInt();
            if (input == 1) {
                System.out.println("Going back");
                room1();
            } else if (input == 2) {
                System.out.println("Going to Library");
                room3();
            } else if (input == 3) {
                System.out.println("Going to Kitchen");
                room4();
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
        System.out.println("You have entered room: " + roomName.get(2));
        System.out.println("The item is : " + items.get(2));
    }


    public void room3() {
        this.roomName.put(3, "Library");
        this.items.put(3, "Spiders");
        while (start) {
            System.out.println("You have enter the following rooms:" +
                    "\n1. Front Room\n2. Dining Room");
            checkInput();
//          int input = scan.nextInt();
            if (input == 1) {
                roomNumChoice = input;
                room2();
            } else if (input == 2) {
                System.out.println("You are going to the Front Room");
                room5();
            } else if (input == 0) {
                exit();
                start = false;
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
        System.out.println("You have entered the " + roomName.get(3));
        System.out.println("The item is : " + items.get(3));
    }

    public void room4() {
        this.roomName.put(4, "Kitchen.");
        this.items.put(4, "Bats");
        while (start) {
            System.out.println("You have enter the following rooms: \n1.Front Room\n2. Parlor");
            checkInput();
//          int input = scan.nextInt();
            if (input == 1) {
                System.out.println("You are going to the Front Room");
                room2();
            } else if (input == 2) {
                System.out.println("You are going to the Parlor");
                room7();
            } else if (input == 0) {
                exit();
                start = false;
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
        System.out.println("You have entered the: " + roomName.get(4));
        System.out.println("The item is : " + items.get(4));
    }

    public void room5() {
        this.roomName.put(5, "Dining room");
        this.items.put(5, "Dust Empty Box");
        while (start) {
            System.out.println("You have enter the following room: \n1. Library");
            checkInput();
//          int input = scan.nextInt();
            if (input == 1) {
                System.out.println("You are going to the Library");
                room2();
            } else if (input == 0) {
                exit();
                start = false;
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
        System.out.println("You have entered the: " + roomName.get(5));
        System.out.println("The item is : " + items.get(5));
    }

    public void room6() {
        this.roomName.put(6, "Vault");
        this.items.put(6, "3 Walking Skeletons");
        Random random = new Random();
        while (start) {
            System.out.println("You have enter the following room: \n1. Parlor\n2. Secret Room");
            checkInput();
//          int input = scan.nextInt();
            if (input == 1) {
                System.out.println("You are going to the Parlor");
                room2();
            } else if (input == 2 && random.nextInt(100) + 1 >= 75) {
                System.out.println("You are going to the Secret Room");
                room8();
            } else if (input == 0) {
                exit();
                start = false;
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
        System.out.println("You have entered the: " + roomName.get(6));
        System.out.println("The item is : " + items.get(6));
    }

    public void room7(){
            this.roomName.put(7, "Parlor");
            this.items.put(7, "treasure chest");
            while (start) {
               System.out.println("You have enter the following room : \n1. West room 6 \n2. South Room 4 ");
               checkInput();
//             input = scan.nextInt();
                if (input == 1) {
                    System.out.println("You are going to the west room");
                    room6();
                } else if (input == 2) {
                    System.out.println("You are going to the South Room");
                    room4();
                } else if (input == 0) {
                    exit();
                    start = false;
                } else {
                    System.out.println("Enter valid input");
                    continue;
                }
            }
            System.out.println("You have entered room: " + roomName.get(7));
            System.out.println("The item is : " + items.get(7));
        }

        // Room 8 added here?

        public void room8(){
            this.roomName.put(8, "Secret Room");
            this.items.put(8, "Piles of gold");
            while (start) {
                System.out.println("You have enter the following room:\n1. West room 6");
//              int input = scan.nextInt();
                if (input == 1) {
                    roomNumChoice = input;
                    room6();
                } else if (input == 0) {
                    exit();
                    start = false;
                } else {
                    System.out.println("Enter valid input");
                    continue;
                }
            }
            System.out.println("You have entered room: " + roomName.get(8));
            System.out.println("The item is : " + items.get(8));
        }
}

