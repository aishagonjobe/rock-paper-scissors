import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
// Write a rock paper scissors game where the user plays against the computer.
// the program will take in an input from user e.g scissors
// the computer will also have a randomly generated choice
// the program must print that it was a draw, or that the user wins or that the pc wins

    public static String generateComputerMove(){
        int computerMove = new Random().nextInt(3);
        String computersMove="";
        if (computerMove==0){
            computersMove="rock";
        } else if (computerMove==1){
            computersMove="paper";
        } else{
            computersMove="scissors";
        }
        return computersMove;
    }

    public static void startGame(String newGame){
        if (newGame.equals("y") || newGame.equals("Y")){
            Scanner player= new Scanner(System.in);
            System.out.println("Enter your move: ");
            String move = player.next();  // Read user input
            String computersMove = generateComputerMove();
            System.out.println("Computer's move: " + computersMove);
            playGame(move, computersMove);
        }else {
            System.out.println("Thanks for playing!");
        }
    }

    public static void playGame(String move, String computersMove){
        if (move.equals("rock") && computersMove.equals("scissors")){
            System.out.println("You win!");
            Scanner PlayerWins= new Scanner(System.in);
            System.out.println("Would you like to play again? Type Y or N: ");
            String nextGame = PlayerWins.next();
            startGame(nextGame);

        } else if (move.equals("paper") && computersMove.equals("rock")){
            System.out.println("You win!");
            Scanner PlayerWins= new Scanner(System.in);
            System.out.println("Would you like to play again? Type Y or N: ");
            String nextGame = PlayerWins.next();
            startGame(nextGame);

        } else if (move.equals("scissors") && computersMove.equals("paper")){
            System.out.println("You win!");
            Scanner PlayerWins= new Scanner(System.in);
            System.out.println("Would you like to play again? Type Y or N: ");
            String nextGame = PlayerWins.next();
            startGame(nextGame);

        } else if (move.equals(computersMove)){
            System.out.println("Game was a draw.");
            Scanner Draw= new Scanner(System.in);
            System.out.println("Would you like to play again? Type Y or N: ");
            String nextGame = Draw.next();
            startGame(nextGame);

        } else {
            System.out.println("Computer wins!");
            Scanner ComputerWins= new Scanner(System.in);
            System.out.println("Would you like to play again? Type Y or N: ");
            String nextGame = ComputerWins.next();
            startGame(nextGame);
        }
    }


    public static void main(String args []){

        System.out.println("Welcome to the Rock-Paper-Scissors game. ");
        System.out.println("The moves in this game are 'rock', 'paper', or 'scissors'. ");
        Scanner start= new Scanner(System.in);
        System.out.println("Ready to start the game? Enter 'Y' or 'N': ");
        String game = start.next();  // Read user input
        startGame(game);
    }
}
