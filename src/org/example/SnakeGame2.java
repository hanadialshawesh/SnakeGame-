package org.example;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame2{  // two player

    Scanner scan = new Scanner(System.in);
    CircularLinkedList<player> players = new CircularLinkedList<>();


    private int rollDice(){
        int n = 0;
        Random random = new Random();
        n = random.nextInt(6) + 1;
        return n;
    }
    
    public void StartGame(){

        System.out.println("===========================================");
        System.out.println("The two players enter your name");
        System.out.print("Player(A) name: ");
        String A = scan.nextLine();
        System.out.print("Player(B) name: ");
        String B = scan.nextLine();     
        System.out.println("===========================================");     
        
        player playerA = new player(A);
        player playerB = new player(B);
        
        
        Random r = new Random();
        System.out.println("Who will start?, Let's see");  
        
        if( (r.nextInt(10)+ 1) % 2 == 0){  // first roll
            
            System.out.println(A + "! you start");
            players.addFirst(playerA);
            players.addLast(playerB);
            
         }
        else{
            System.out.println(B + "! you start");
            players.addFirst(playerB);
            players.addLast(playerA);
            
        }

        System.out.println("===========================================");
        
        while( playerA.getposition() < 100 && playerB.getposition() < 100){

         System.out.println("===========================================");
            
            int num = 0;
            System.out.println(players.first().getPlayerName() + " enter 'R' to roll the dice");
            String roll = scan.nextLine();
            
            if( roll.equalsIgnoreCase("R")){
                
                num = rollDice();
                if( num == 6){
                    System.out.println("you got 6 roll the dice again, enter 'R' to roll the dice");
                    String roll2 = scan.nextLine();
                    if( roll2.equalsIgnoreCase("R")){
                        num = num + rollDice();
                        System.out.println("you got "+ num);
                    }
                }else{
                    System.out.println("you got "+ num);
                }
            }
            
            players.first().setPosition(num);

       


            if(players.first().getposition() == 1 )
                players.first().setPosition(37);
            if(players.first().getposition() == 4)
                players.first().setPosition(10);
            if(players.first().getposition() == 8)
                players.first().setPosition(22);
            if(players.first().getposition() == 21)
                players.first().setPosition(21);
            if(players.first().getposition() == 28)
                players.first().setPosition(48);
            if(players.first().getposition() == 50)
                players.first().setPosition(17);
            if(players.first().getposition()== 80)
                players.first().setPosition(19);
            if(players.first().getposition()==71)
                players.first().setPosition(21);
            
            
            if(players.first().getposition()== 36)
                players.first().setPosition(-30);
            if(players.first().getposition() == 62)
                players.first().setPosition(-44);
            if(players.first().getposition() == 48)
                players.first().setPosition(-22);
            if(players.first().getposition() == 32)
                players.first().setPosition(-22);
            if(players.first().getposition() == 88)
                players.first().setPosition(-64);
            if(players.first().getposition() == 95)
                players.first().setPosition(-39);
            if(players.first().getposition() == 97)
                players.first().setPosition(-19);
            
            if(players.first().getposition() > 100)
                System.out.println(players.first().getPlayerName() + " is in position 100 " );
            else    
                System.out.println(players.first().getPlayerName() + " is in position " + players.first().getposition());
        
            players.rotate();
                     
        }

        System.out.println("===========================================\n");
                
        if(playerA.getposition() >= 100)
            System.out.println("||        The winnier is .... player " + playerA.getPlayerName() + "        ||\n");
        if(playerB.getposition() >= 100)
            System.out.println("||        The winnier is .... player " + playerB.getPlayerName() + "        ||\n");              
    }  
}