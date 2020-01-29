package com.company;

import java.util.HashMap;
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
        if(random.nextInt(100) + 1 >= 75){
            System.out.println("Ghost is following you");
        }
    }


    public void room1() {
        this.roomName.put(1, "Foyer");
        this.items.put(1, "Dead Scorpion");


        System.out.println("You have entered room: " + roomName.get(1));
        System.out.println("The item is : " + items.get(1));
        while (start) {
            System.out.println("Enter what room you want to enter:\n1. Front Room\n0. Exit");
            input = scan.nextInt();
            if (input == 1) {
//                room2();
            } else if (input == 0) {
                exit();
                start = false;
            } else {
                System.out.println("Enter valid input");
                continue;
            }
        }
    }

    public void room2() {
        this.roomName.put(2, "Front Room");
        this.items.put(2, "Dead Scorpion");
        System.out.println("You have entered room: " + roomName.get(2));
        System.out.println("The item is : " + items.get(2));
        while (start) {
            System.out.println("Enter what room you want to enter:" +
                    "\n1. Go back \n2. Library \n3. Kitchen");
            input = scan.nextInt();
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
    }


    public void room3() {
        this.roomName.put(3, "Library");
        this.items.put(3, "Spiders");


        System.out.println("You have entered the " + roomName.get(3));
        System.out.println("The item is : " + items.get(3));

        while (start) {
            System.out.println("Enter what room you want to enter:" +
                    "\n1. Front Room\n2.Dining Room");
            int input = scan.nextInt();
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
    }


}

