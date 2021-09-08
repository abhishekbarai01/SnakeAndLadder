package com.bridgelabz;

public class SnakeAndLadderUC6 {
    public static void main(String[] args) {
        int current_position=0;
        int diceRollNo=0;
        while (current_position != 100) {
            diceRollNo++;

            int diceValue=1+(int)Math.floor(Math.random()*10)%6;
            System.out.println("Die Rolled:"+diceValue);

            int option_check=(int)Math.floor(Math.random()*10)%3;

            if (option_check == 0) {
                System.out.println("No Play");
            }
            else if (option_check == 1) {
                System.out.println("Ladder Comes");
                if(current_position+diceValue<=100)
                {
                    current_position+=diceValue;
                }
                else if(current_position+diceValue>100)
                {
                    continue;
                }
            }
            else {
                System.out.println("Snake Comes");
                if((current_position-diceValue)<0)
                {
                    current_position=0;
                }
                else
                {
                    current_position-=diceValue;
                }
            }
            System.out.println(diceRollNo);
            System.out.println("Player Position After each Dice Roll  in game"+ diceValue);
        }
        System.out.println("Number Of Dice Rolled To Win game " + diceRollNo);

    }

}
