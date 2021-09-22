package com.sunanda;

public class Snakeladder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to snake ladder game");
        int player=0;
        int position;
        int position1=0;
        int[] playerPosition=new int[2];
        int diceRollCount=0;
        while (playerPosition[player]<100)
        {
            int randomCheck = (int) Math.floor(Math.random() + 1) % 6;
            System.out.println("Random Dice number is :- " + randomCheck);
            diceRollCount++;
            int place = (int) Math.floor(Math.random()) % 3;
            System.out.println("Place is :- " + place);
            if (place == 1)
            {
                if(playerPosition[player] + randomCheck<=100)
                {
                    playerPosition[player]=playerPosition[player]+randomCheck;
                }
            }
            if (place == 2)
            {
                playerPosition[player]=playerPosition[player]-randomCheck;
               if(playerPosition[player]<0)
               {
                   playerPosition[player]=0;
               }
            }
            else
            {
                System.out.println("Player"+player+"Position"+playerPosition[player]);
            }
            if (place==0||place==2)
            {
                if (player == 0)
                {
                    player =1;
                }
                else
                {
                    player =0;
                }
            }
            System.out.println("The winner of snake and ladder is player"+player);
            System.out.println("The number of times dice roll is"+diceRollCount);
        }
    }
}
