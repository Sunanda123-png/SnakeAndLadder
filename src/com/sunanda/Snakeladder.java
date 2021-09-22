package com.sunanda;

public class Snakeladder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to snake ladder game");
        int player=1;
        int position=0;
        int randomCheck=(int) Math.floor(Math.random()+1)%6;
        System.out.println("Random Dice number is :- "+randomCheck);
        int place=(int) Math.floor(Math.random())%3;
        System.out.println("Place is :- "+place);
        if(place==1)
        {
            System.out.println("Ladder moves ahead by the position receive in the die");
        }
        if(place==2)
        {
            System.out.println("snake moves behind by the position receive in the die");
        }
        else
        {
            System.out.println("Incase no playe stay in same position");
        }

    }
}
