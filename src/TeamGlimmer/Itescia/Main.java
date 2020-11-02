package TeamGlimmer.Itescia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Select a game");
        System.out.println("1. Guess a number");
        System.out.println("2. The Palydrome Game");
        //add other games later
        System.out.println("4. Quit application");

        Scanner sc = new Scanner(System.in);
        int gameSelect = sc.nextInt();

        switch (gameSelect){
            case 1 :
                GuessANumber.numberGameDifficulty();
                break;
            case 2 :
                Palyndrome.palyndromeGame();
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid input");
                main(null);
        }
    }
}
