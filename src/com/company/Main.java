package com.company;

import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void inputCheck(Scanner sc) {
        try {
            System.out.println("Please enter a room number: ");
            int newInput = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("That is not an integer, please try again.");
        }

    }

    public static void main(String[] args) {
        Room startGame = new Room();
        Scanner scan=new  Scanner(System.in);

    }
}