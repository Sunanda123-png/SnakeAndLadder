package com.sunanda;

public class Snakeladder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to snake ladder game");
        int player=1;
        int position=0;
        int randomCheck=(int) Math.floor(Math.random()+1)%6;
        System.out.println("Random Dice number is :- "+randomCheck);
    }
}
