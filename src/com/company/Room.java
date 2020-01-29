package com.company;

import java.util.HashMap;
import java.util.Scanner;


public class Room {

        int roomNumChoice;
    static boolean start = true;
    static Scanner scan = new Scanner(System.in);
    HashMap<Integer, String> items = new HashMap<Integer, String>();
    HashMap<Integer, String> roomName = new HashMap<Integer, String>();



    public Room(){
     room1();
    }

    public int room3(int roomChoiceNum){
        System.out.println("You are in room 3");
        return roomChoiceNum;

    }
    public void exit(){
        System.out.println("You have exited the game");
    }


    public void room1(){
        this.roomName.put(1, "Foyer");
        this.items.put(1, "Dead Scorpion");


        System.out.println("You have entered room: " + roomName.get(1));
        System.out.println("The item is : " + items.get(1));
        while(start){
            System.out.println("Enter what room you want to enter:1. West room 2 | 2. North Room 7 ");
            int input = scan.nextInt();
        if(input == 2){
            roomNumChoice = input;
            room2();
        }else if (input == 0){
            exit();
            start = false;
        }else{
            System.out.println("Enter valid input");
            continue;
        }
        }
    }

    public void room2(){
        this.roomName.put(2, "room 2");
        this.items.put(2, "Dead Scorpion");


        System.out.println("You have entered room: " + roomName.get(2));
        System.out.println("The item is : " + items.get(2));
        while(start){
            System.out.println("Enter what room you want to enter:1. West room 2 | 2. North Room 7 ");
            int input = scan.nextInt();
            if(input == 2){
                roomNumChoice = input;
                room2();
            }else if (input == 0){
                exit();
                start = false;
            }else{
                System.out.println("Enter valid input");
                continue;
            }
        }

    }


    public void room3() {
        this.roomName.put(3, "youre in room 3");
        this.items.put(3, "Dead Scorpion");


        System.out.println("You have entered room: " + roomName.get(3));
        System.out.println("The item is : " + items.get(3));

        while (start) {
            System.out.println("Enter what room you want to enter:1. West room 2 | 2. North Room 7 ");
            int input = scan.nextInt();
            if (input == 2) {
                roomNumChoice = input;
                room2();
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

