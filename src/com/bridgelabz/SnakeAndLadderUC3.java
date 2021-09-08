package com.bridgelabz;

public class SnakeAndLadderUC3 {
    public static void main( String args[] ) {

        int current_position = 0;
        //Generate random int value from 1 to 6
        int diceValue = (int) (1 + Math.floor(Math.random() * 10) % 6);
        System.out.println("Random int Dice value: " + diceValue);

        /* --------------------------------------------CHECK OPTIONS----------------------------------------------------------------*/
	    /* 0. if option check = stay at same position with dice value
	      1. if option check = move backward with dice value
	      2. if option check  = move forward with dice value
	      ----------------------------------------------------------------------------------------------------------------------------------*/

        int option_check = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("option check int value: " + option_check);

        switch (option_check) {
            case 1:
                current_position = current_position + diceValue;
                System.out.println("forward: " + current_position);
                break;
            case 2:
                current_position = current_position - diceValue;
                System.out.println("backward: " + current_position);
                break;
            default:
                current_position = 0;
                System.out.println(" stay on same position: " + current_position);

        }

    }
}
