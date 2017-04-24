package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static int errorCheck(char letter, String phrase, int errors){
        int count = 0;
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == letter){
                count++;
            }
        }
        if (count > 0){
            return errors;
        }
        else{
            errors++;
            return errors;
        }
    }

    public static String phraseObfuscation(char letter, String phrase, String lastPhrase){
        String solution = "";
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == letter){
                solution = solution + letter;
            }
            else if (lastPhrase.length() == phrase.length() && lastPhrase.charAt(i) != '_'){
                solution = solution + lastPhrase.charAt(i);
            }
            else if (phrase.charAt(i) == ' '){
                solution = solution + " ";
            }
            else {
                solution = solution + "_";
            }
        }
        return solution;
    }

    public static boolean isCorrect(String phrase, String puzzle){
        if (phrase.equals(puzzle)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter a word or phrase for your of Hangman");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine().toUpperCase();

        System.out.println("Please enter the number of false guesses you would like to allow");
        Scanner scan2 = new Scanner(System.in);
        int errorsAllowed = scan.nextInt();

        int numberErrors = 0;
        String currentPuzzle = "";
        boolean completed = false;

        while (numberErrors < errorsAllowed && completed == false){
            System.out.println("Please enter a single letter guess: ");
            Scanner scans = new Scanner(System.in);
            char letter = Character.toUpperCase(scan.next().charAt(0));

            numberErrors = errorCheck(letter, phrase, numberErrors);
            currentPuzzle = phraseObfuscation(letter, phrase, currentPuzzle);
            completed = isCorrect(phrase, currentPuzzle);

            System.out.println("This is the current puzzle: >" + currentPuzzle + "< False Guesses: " + numberErrors);
        }
        if (completed){
            System.out.println("Congratulations, you solved the puzzle!");
        }
        else {
            System.out.println("I'm sorry, you were unable to complete the puzzle");
        }
    }
}
