import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        String playerchoice;
        int r;
        r = 1;
        int p;
        p = 2;
        int s;
        s = 3;
        int random; //random = computer choice
        int x; //x in the number of wins by player
        x = 0;
        int y; //y is number of wins by computer
        y = 0;

        Scanner scan = new Scanner(System.in); //imports the scanner
        System.out.println("Choose rock paper or scissor. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");//computer asks this question

        do { // does all of this for the loop
            System.out.println("**********************************************");
            System.out.println("Wins: " + x + "\tLosses: " + y);//this is for the score sheet where x = #wins and y = #losses
            System.out.println("Player choice:");
            playerchoice = (scan.next()); //player answers question
            random = (int) (Math.random() * 100); //generates a number between 0 - 100, for computer choice


            if (playerchoice.equals("r")) { // very important, this is if the player chooses the value r for "rock"

                if (((random >= 0) && (random < 33))) { //If the random number generated is between these values computer chooses Scissor
                    System.out.println("You Win!\nComputer Choice: scissor\tPlayer Choice: rock");//prints outcome
                    x++;//when the player wins, the score goes up by 1
                } else if ((random >= 33) && (random < 66)) { //If the random number generated is between these values computer chooses Rock
                    System.out.println("Draw!\nComputer Choice: rock\tPlayer Choice: rock");
                } else if ((random >= 66) && (random <= 100)) { //If the random number generated is between these values computer chooses Paper
                    System.out.println("You Lose!\nComputer Choice: paper\tPlayer Choice: rock");
                    y++;//when the player loses the number of losses goes up
                }
            } else if (playerchoice.equals("s")) { // this is for if the player chooses "s" for scissor
                if (((random >= 0) && (random < 33))) { //computer chooses Scissor
                    System.out.println("Draw!\nComputer Choice: scissor\tPlayer Choice: scissor");
                } else if ((random >= 33) && (random < 66)) { //computer chooses Rock
                    System.out.println("You Lose!\nComputer Choice: rock\tPlayer Choice: scissor");
                    y++;//when the player loses the number of losses goes up
                } else if ((random >= 66) && (random <= 100)) { //computer chooses Paper
                    System.out.println("You Win!\nComputer Choice: paper\tPlayer Choice: scissor");
                    x++;//when the player wins, the score goes up by 1
                }
            } else if (playerchoice.equals("p")) { // this is for the player if they choose "p" for paper
                if (((random >= 0) && (random < 33))) { //computer chooses Scissor
                    System.out.println("You Lose!\nComputer Choice: scissor\tPlayer Choice: paper");
                    y++;//when the player loses the number of losses goes up
                } else if ((random >= 33) && (random < 66)) { //computer chooses Rock
                    System.out.println("You Win!\nComputer Choice: rock\tPlayer Choice: paper");
                    x++;//when the player wins, the score goes up by 1
                } else if ((random >= 66) && (random <= 100)) { //computer chooses Paper
                    System.out.println("Draw!\nComputer Choice: paper\tPlayer Choice: paper");
                }
            }else if (playerchoice.equals("x")) { //if player chooses x the loop will break
                    System.out.println("Thank you for playing!");//this comment is inserted after player select 'x'
                    break;//breaks the loop

            }else //If none of the options above were chose, 'r' 's' 'p' or 'x' this will show up
                System.out.println("Invalid selection please select a valid option");//this will loop again and prompt the player to select a valid answer


        }while (!playerchoice.equals("x")); //this means this loop will go on for any character inserted by player except x

    }
    }
