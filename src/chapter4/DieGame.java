package chapter4;

/*
* The objective of the game is to travel
* the entire game board of 20 spaces
* within 5 die rolls.
* Roll the die for the user (generate a
* Random number between 1 – 6) and advance
* the user that number of spaces on the
* game board.
* After each roll, tell the user which game
* space they are on and how many more spaces
*  they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the  board, so a message like “You
* advanced to space 22” is a bug.
* */

import java.util.Random;

public class DieGame {
    public static void main(String[] args) {

//        Initialize what we know
        int lastSpace = 20;
        int currSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");
        for (int i = 1; i <= maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currSpace = currSpace + die;

            System.out.print(String.format("Roll %d: You've rolled a %d. ", i, die));


           if (currSpace == lastSpace){
               System.out.print("You're on space " + currSpace + ". Congrats, you win!");
               break;
           }else if (currSpace > lastSpace){
               System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You loose!");
               break;
           }else {
               int spacesToGo = lastSpace - currSpace;
               System.out.print("You are now on space " + currSpace + " and have " + spacesToGo + " more to go.");
           }
            System.out.println();
        }
    }
}
