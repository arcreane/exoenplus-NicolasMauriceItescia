package TeamGlimmer.Itescia;

import java.util.Scanner;

public class Palyndrome {

    public static void palyndromeGame(){
        System.out.println("Please select a check method");
        System.out.println("1. Use String functionalities");
        System.out.println("2. Use a for loop");
        Scanner sc = new Scanner(System.in);
        int checkPalyndrome = sc.nextInt();
        System.out.println("Enter your word to be checked");
        Scanner sc2 = new Scanner(System.in);
        String userWord = sc2.nextLine();

        switch (checkPalyndrome) {
            case 1 -> stringFunctionalities(userWord);
            case 2 -> forLoop(userWord);
            default -> {
                System.out.println("Please enter a valid input");
                palyndromeGame();
            }
        }
    }

    public static void stringFunctionalities(String word){
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println(reversedWord);
        if(word.equals(reversedWord)){
            System.out.println("Your word is a palyndrom !");
        }
        else{
            System.out.println("Your word is not a palyndrom !");
        }
        Main.main(null);
    }

    public static void forLoop(String word){
        char[] arrayOfTheWord= word.toCharArray();

        if ((arrayOfTheWord.length%2)==0){
            for (int i=0;i<=(arrayOfTheWord.length/2);i++){
                if (arrayOfTheWord[i]!=arrayOfTheWord[arrayOfTheWord.length-1-i]){
                    System.out.println("Your word is not a palyndrom !");
                    Main.main(null);
                }
            }
        }
        else{
            for (int i=0;i<(arrayOfTheWord.length/2);i++){
                if (arrayOfTheWord[i]!=arrayOfTheWord[arrayOfTheWord.length-1-i]){
                    System.out.println("Your word is not a palyndrom !");
                    Main.main(null);
                }
            }
        }
        System.out.println("Your word is a palyndrom !");
        Main.main(null);
    }
}
