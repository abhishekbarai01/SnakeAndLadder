package com.bridgelabz;

public class SnakeAndLadderUC2 {
    public static void main(String[] args) {

        //Generate random int value from 1 to 6
        double diceValue = 1 + Math.floor(Math.random() * 10) % 6;
        System.out.println("Random int Dice value: " + diceValue);
    }
}
