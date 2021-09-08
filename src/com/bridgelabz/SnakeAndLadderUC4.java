package com.bridgelabz;

public class SnakeAndLadderUC4 {
    public static void main(String[] args) {
        int current_position = 0;
        while ( current_position != 100 ){
            int diceValue = 1 + (int) Math.floor(Math.random()*10)%6;
            System.out.println(" Die Roll :" + diceValue);
            int option_check = (int) Math.floor(Math.random()*10)%3;

            if ( option_check == 0){
                System.out.println("no player");
            }
            else if (option_check == 1){
                option_check += diceValue;
                System.out.println("ladder found");
            }
            else{
                System.out.println("snake found");
                if ((current_position - diceValue)<0)
                {
                    current_position = 0;
                }

                else
                {
                    current_position -= diceValue;
                }
            }
        }
    }
}
// switch (option_check) {
//                case 0:
//                    current_position = current_position + diceValue;
//                    System.out.println("forward: " + current_position);
//                    break;
//                case 2:
//                    current_position = current_position - diceValue;
//                    System.out.println("backward: " + current_position);
//                    break;
//                default:
//                    current_position = 0;
//                    System.out.println(" stay on same position: " + current_position);
//
//            }