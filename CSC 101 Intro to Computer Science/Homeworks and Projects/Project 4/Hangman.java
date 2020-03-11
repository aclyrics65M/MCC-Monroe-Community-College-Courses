/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #4
   Program 2: Hangman.java
*/

/*
   This program is not from the book, but it is based on chapter 9 information.  
   I want you to create a hangman game.  The program will start with by asking 
   the user for the hidden word or phrase (can be multiple words).  And then 
   ask for how many missed guesses are allowed before you will lose.  Then the 
   game will begin, (we are assuming a second person will take over at this point). 
   As the game begins you will show a series of dashes that represent each letter 
   in the word or phrase (blank spaces and punctuation should still show). 
   The user will guess a letter.  If that letter exists – all versions of that
   letter (upper and lower case) will appear among the dashes.  If it doesn’t
   exist – you will be told that you have used up one of your misses and only
   have X number of guesses left. As you continue to guess letters, correct
   letters should stay shown on screen.  You continue to guess letters until
   you either unveil all the letters, or you run out of missed guesses.
   Repeating a letter should count as a miss, but if you have problems with
   this, leave it as no change to status.  
*/


import java.util.Scanner;

public class Hangman {

   public static void main(String[] args) {
      
      // Create a scanner object
      Scanner scanner = new Scanner(System.in);
      
      // Welcome statement
      System.out.println("Hello there! Welcome to the Java Hangman Program!");
      System.out.println(); // blank space
      
      // Prompt First user to input a phrase
      System.out.print("Please enter a phrase for user to guess: ");
      String guessPhraseSample = scanner.nextLine();
      // Convert to lower case all letters
      String guessPhrase = guessPhraseSample.toLowerCase();
      
      System.out.print("Please enter number of allowed missed guesses: ");
      int numberMissedGuesses = scanner.nextInt();
      
      System.out.println(); // Blank space
      
      // Create a stringbuilder
      StringBuilder javaStringBuilder = new StringBuilder(guessPhrase);
      char dashCharacter = '-';
      
      // Create a variable that counts number of spaces, punctuation
      int numberSpacesPunctuation = 0;      
      
      // Convert all letters in guess phrase to dashes
      for (int i = 0; i < guessPhrase.length(); i++) {
         
         // If statement
         if ((guessPhrase.charAt(i) >= 'a' && guessPhrase.charAt(i) <= 'z') || 
            (guessPhrase.charAt(i) >= 'A' && guessPhrase.charAt(i) <= 'Z')) {
            javaStringBuilder.setCharAt(i,dashCharacter);
            
         } else {
            numberSpacesPunctuation++; // Increment the number of spaces and punctuation
         }
      }
      
      // System.out.println(guessPhrase);
      System.out.println(javaStringBuilder);
      
      // Create a guess count variable and initialize it to zero.
      int guessCount = 0;
      
      // Create a variable that indicates the number of guesses remaining
      int numberGuessesRemaining = numberMissedGuesses;
      
      // Create a variable that keeps track of letters guessed
      int numberLettersGuessed = 0; 
       
      // Prompt Second user to guess the phrase
      while (guessCount < numberMissedGuesses) {
         System.out.print("Please guess a missing letter: ");
         char letterGuess = scanner.next().charAt(0);
         
         // Create a boolean to check if letter is found
         boolean letterStatus = false; // Set it to false
         
         for(int j = 0; j < guessPhrase.length(); j++) { 
         
            if(Character.toUpperCase(letterGuess) == Character.toUpperCase(guessPhrase.charAt(j))) {
               letterStatus = true;           
               javaStringBuilder.setCharAt(j, letterGuess);
               // Increment the number of letters guessed
               numberLettersGuessed++;
            } 
            
            
         }
         // Display current progress of guessing game
         System.out.println(javaStringBuilder);
         System.out.println(); // blank space
         System.out.println("Number of letters correctly guessed: " + numberLettersGuessed);
         
         if (!letterStatus) {
            // Increment the guess count
            guessCount++;
               
            // Decrement the number of guesses remaining
            numberGuessesRemaining--;
               
            System.out.println("Sorry! Letter is not there!");
            System.out.println("You have " + numberGuessesRemaining + " guesses remaining");
            System.out.println(); // blank space
               
         }
         
         // if the java string is equal to the phrase minus the number of spaces and punctuation 
         if (numberLettersGuessed == (guessPhrase.length() - numberSpacesPunctuation)) {
            System.out.println("Congratulations! You have guessed the phrase!");
            // Make guess count equal to the numberMissedGuesses
            // To break out of the while loop
            guessCount = numberMissedGuesses;
         } 
            
      }  
      
      System.out.println(); // blank space
      System.out.println("Thank you very much for playing the Java Hangman Game!");
      System.out.println("Goodbye!"); 
      
  
   } // End of Main class


} // End of Hangman class