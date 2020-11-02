package TeamGlimmer.Itescia;

import java.util.Scanner;

public class GuessANumber {

    public static void numberGameDifficulty(){
        System.out.println("select how you want to play");
        System.out.println("1. Unlimited tries");
        System.out.println("2. Limited to 10 tries");

        Scanner sc = new Scanner(System.in);
        int difficultySelect = sc.nextInt();

       boolean hard =false;

        switch (difficultySelect){
            case 1 :
                break;
            case 2 :
                hard = true;
                break;
            default:
                System.out.println("Please enter a valid input");
                numberGameDifficulty();
        }
        numberGame(hard);
    }

    public static void numberGame (boolean dif){
        int targetNumber = (int)(Math.random()*100);
        for(int i=0;i>-1;i++){
            System.out.println("Please input a number, you are on try #"+(i+1));
            Scanner sc2 = new Scanner(System.in);
            int numberGuessed = sc2.nextInt();

            if (numberGuessed==targetNumber){
                System.out.println("Congrats ! you found the correct number !");
                Main.main(null);
                break;
            }
            else if (numberGuessed > targetNumber){
                System.out.println("The number you're looking for is lower !");
                if (numberGuessed-targetNumber <= 10){
                    System.out.print("But you're close !");
                }
            }
            else if (numberGuessed < targetNumber){
                System.out.println("The number you're looking for is higher !");
                if (targetNumber-numberGuessed <= 10){
                    System.out.print("But you're close !");
                }
            }

            if (dif == true&& i==9){
                System.out.println("Sorry, but you lost the game ! The number was: "+targetNumber);
                Main.main(null);
                break;
            }
        }
    }
}
