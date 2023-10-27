package org.example;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    boolean exit = true;
    SnakeGame1 game1 = new SnakeGame1();
    SnakeGame2 game2 = new SnakeGame2();

     
    System.out.println( "-- Welcome to our game, Which is a snack and ladders game --\n");
    System.out.print("THE RULES OF THE GAME ARE :\n");
    System.out.println("Every player will take turn to roll the dice");
    System.out.println("The first player that reaches the highest space on the board, 100, wins the game");
    System.out.println("If you land on any snake head you will go down to its tail");
    System.out.println("If you land at the beginning of a ladder you will go up to the ladder\'s top");
    System.out.println("If you roll a six, then you get an extra turn\n\n");

     System.out.println("Snake symbol : (@) \nLadder symbol : (^)");
     System.out.println(
        "----------------------------------------------\n"
        + "100 99  98   @  96  @   94  93  92  91\n"
        + "81  82  83  84  85  86  87  @   89  90 \n"
        + "^   79  78  77  76  75  74  73  72  ^  \n" 
        + "61  @   63  64  65  66  67  68  69  70 \n"
        + "60  59  58  57  56  55  54  53  52  51 \n"
        + "41  42  43  44  45  46  47  @   49  ^  \n"
        + "40  39  38  37  @   35  34  33  @   31 \n"
        + "^   22  23  24  25  26  27  ^   29  30 \n"
        + "20  19  18  17  16  15  14  13  12  11 \n"
        + "^   2   3   ^   5   6   7   ^   9   10\n"
        + "----------------------------------------------\n");

    while (exit) {
    System.out.println("Please choose how you want to play \n1. with the computer \t2. with your friend \t3.exit");

    int answer = input.nextInt();
        
        switch(answer){

            case 1:
                game1.StartGame(); 
                break;
            case 2:
                game2.StartGame();
                break;
            case 3:
                exit = false;
                System.out.println("Godbye"); 
                break; 
            default:
                System.out.println(answer + " invalid number please try again");
                input.close();
        }
    }
                
 } // end 
}
