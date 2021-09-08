package com.bridgelabz;

public class SnakeAndLadderUC7 {

    public static void main(String[] args) {

        int playerposition1=0;
        int playerposition2=0;
        System.out.println("Player1 is initially at " + playerposition1);
        System.out.println("Player1 is initially at " + playerposition2);
        double dice;
        int dice_countp1=0;
        int dice_countp2=0;
        int value=0;
        while(playerposition1<=100 || playerposition2<=100)
        {
            dice=1+ Math.floor(Math.random()*10)%6;
            if(dice>0)
            {
                value=(int)dice;
                System.out.println("Dice for Player 1 rolled at "+ value);
                playerposition1=playerposition1+value;
                dice_countp1++;
            }

            dice=1+ Math.floor(Math.random()*10)%6;
            if(dice>0)
            {
                value=(int)dice;
                System.out.println("Dice for Player 2 rolled at "+ value);
                playerposition2=playerposition2+value;
                dice_countp2++;
            }

            if(playerposition1==2)
            {
                System.out.println("Player1 Ladder to 23");
                playerposition1=23;
            }
            else if(playerposition1==7)
            {
                System.out.println("Player1 Ladder to 29");
                playerposition1=29;
            }
            else if(playerposition1==22)
            {
                System.out.println("Player1 Ladder to 41");
                playerposition1=41;
            }
            else if(playerposition1==28)
            {
                System.out.println("Player1 Ladder to 77");
                playerposition1=77;
            }
            else if(playerposition1==30)
            {
                System.out.println("Player1 Ladder to 32");
                playerposition1=32;
            }
            else if(playerposition1==54)
            {
                System.out.println("Player1 Ladder to 69");
                playerposition1=77;
            }
            else if(playerposition1==70)
            {
                System.out.println("Player1 Ladder to 90");
                playerposition1=90;
            }
            else if(playerposition1==80)
            {
                System.out.println("Player1 Ladder to 98");
                playerposition1=98;
            }
            else if(playerposition1==27)
            {
                System.out.println("Player1 Snaked to 6");
                playerposition1=6;
            }
            else if(playerposition1==35)
            {
                System.out.println("Player1 Snaked to 5");
                playerposition1=5;
            }
            else if(playerposition1==39)
            {
                System.out.println("Player1 Snaked to 3");
                playerposition1=3;
            }
            else if(playerposition1==50)
            {
                System.out.println("Player1 Snaked to 34");
                playerposition1=34;
            }
            else if(playerposition1==59)
            {
                System.out.println("Player1 Snaked to 46");
                playerposition1=46;
            }
            else if(playerposition1==66)
            {
                System.out.println("Player1 Snaked to 24");
                playerposition1=24;
            }
            else if(playerposition1==73)
            {
                System.out.println("Player1 Snaked to 12");
                playerposition1=12;
            }
            else if(playerposition1==76)
            {
                System.out.println("Player1 Snaked to 63");
                playerposition1=63;
            }
            else if(playerposition1==89)
            {
                System.out.println("Player1 Snaked to 67");
                playerposition1=67;
            }
            else if(playerposition1==97)
            {
                System.out.println("Player1 Snaked to 75");
                playerposition1=75;
            }
            else if(playerposition1==99)
            {
                System.out.println("Player1 Snaked to 26");
                playerposition1=26;
            }

            if(playerposition2==2)
            {
                System.out.println("Player2 Ladder to 23");
                playerposition2=23;
            }
            else if(playerposition2==7)
            {
                System.out.println("Player2 Ladder to 29");
                playerposition2=29;
            }
            else if(playerposition2==22)
            {
                System.out.println("Player2 Ladder to 41");
                playerposition2=41;
            }
            else if(playerposition2==28)
            {
                System.out.println("Player2 Ladder to 77");
                playerposition2=77;
            }
            else if(playerposition2==30)
            {
                System.out.println("Player2 Ladder to 32");
                playerposition2=32;
            }
            else if(playerposition2==54)
            {
                System.out.println("Player2 Ladder to 69");
                playerposition2=77;
            }
            else if(playerposition2==70)
            {
                System.out.println("Player2 Ladder to 90");
                playerposition2=90;
            }
            else if(playerposition2==80)
            {
                System.out.println("Player2 Ladder to 98");
                playerposition2=98;
            }
            else if(playerposition2==27)
            {
                System.out.println("Player2 Snaked to 6");
                playerposition2=6;
            }
            else if(playerposition2==35)
            {
                System.out.println("Player2 Snaked to 5");
                playerposition2=5;
            }
            else if(playerposition2==39)
            {
                System.out.println("Player2 Snaked to 3");
                playerposition2=3;
            }
            else if(playerposition2==50)
            {
                System.out.println("Player2 Snaked to 34");
                playerposition2=34;
            }
            else if(playerposition2==59)
            {
                System.out.println("Player2 Snaked to 46");
                playerposition2=46;
            }
            else if(playerposition2==66)
            {
                System.out.println("Player2 Snaked to 24");
                playerposition2=24;
            }
            else if(playerposition2==73)
            {
                System.out.println("Player2 Snaked to 12");
                playerposition2=12;
            }
            else if(playerposition2==76)
            {
                System.out.println("Player2 Snaked to 63");
                playerposition2=63;
            }
            else if(playerposition2==89)
            {
                System.out.println("Player2 Snaked to 67");
                playerposition2=67;
            }
            else if(playerposition2==97)
            {
                System.out.println("Player2 Snaked to 75");
                playerposition2=75;
            }
            else if(playerposition2==99)
            {
                System.out.println("Player2 Snaked to 26");
                playerposition2=26;
            }




            if (playerposition1>100 || playerposition2>100)
            {
                if(playerposition1>100)
                {
                    playerposition1=playerposition1-value;
                    continue;
                }
                else
                {
                    playerposition2=playerposition2-value;
                    continue;
                }
            }else if(playerposition1==100 || playerposition2==100)
            {
                if(playerposition1==100)
                {
                    System.out.println();
                    System.out.println("Player1 reached 100");
                    System.out.println("Player 1 Wins");
                    System.out.println();
                    break;
                }
                else
                {   System.out.println();
                    System.out.println("Player2 reached 100");
                    System.out.println("Player 2 Wins");
                    System.out.println();
                    break;
                }
            }
            System.out.println("Player1 is at "+ playerposition1);
            System.out.println("Player2 is at "+ playerposition2);
            System.out.println();
        }
        System.out.println("Player1 is now at "+ playerposition1);
        System.out.println("Player2 is now at "+ playerposition2);
        System.out.println();
        System.out.println("Player 1 has rolled "+ dice_countp1 + " times.");
        System.out.println("Player 2 has rolled "+ dice_countp2 + " times.");

    }
}
