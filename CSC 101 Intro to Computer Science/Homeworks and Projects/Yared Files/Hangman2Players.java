import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hangman2Players {
    public static void main(String[] args) {

        GameHelper2Players game = new GameHelper2Players ();
        Scanner sc = new Scanner(System.in);
        String input;
        char guess;
        boolean keepPlaying = true;

        System.out.println("All the best!!!");
        game.initializeGame();
        do {
            System.out.print("\nWord to guess: \n\n");
            game.showRow();

            System.out.print("\n\nMisses: ");
            game.showMisses();

            System.out.print("\nGuess: ");
            input = sc.next();
            try {
                if (!Character.isLetter(input.charAt(0)) || input.length() > 1) {
                    throw new InputMismatchException("Input is not a letter");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter only a letter");
                continue;
            }
            if (input.equalsIgnoreCase("exit"))
                break;
            else if (input.equalsIgnoreCase("new"))
                game.initializeGame();
            else {
                guess = input.charAt(0);
                game.checkRow(guess);

                if (game.isLooser()) {
                    System.out.println("\nGame Over!\nYou have missed " + game.numberOfMisses +" times!\nThe word[s] was/were '" + game.getSecretWord() + "' ! \n");
                    //game.initializeGame();
                    boolean val = false;
                    while(!val) {
                        System.out.println("Do you want to play again? [y/n]: ");
                        String playAgain = sc.next();
                        if (playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("No")) {
                            val = true;
                            keepPlaying = false;
                        } else if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("Yes")) {
                            val = true;
                            keepPlaying = true;
                            game.initializeGame();
                        } else {
                            System.out.println("Enter a valid option");
                        }
                    }
                }

                else if (game.IsWinner()) {
                    System.out.println("\nCongratulations!\nYou have guessed the word[s] '" + game.getSecretWord() + "' !!\n");
                    boolean val = false;
                    while(!val) {
                        System.out.println("Do you want to play again? [y/n]: ");
                        String playAgain = sc.next();
                        if (playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("No")) {
                            val = true;
                            keepPlaying = false;
                        } else if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("Yes")) {
                            val = true;
                            keepPlaying = true;
                            game.initializeGame();
                        } else {
                            System.out.println("Enter a valid option");
                        }
                    }
                }
            }
        } while (keepPlaying);

        System.out.println("\nThank you for playing !");
        sc.close();
    }

}

class GameHelper2Players {
    Random random = new Random();
    StringBuffer misses = new StringBuffer("");
    int numberOfMisses;
    private ArrayList<String> words;
    private String secretWord;
    char[] hangman;

    public GameHelper2Players() {
        words = new ArrayList<>();
        try {
            File file = new File("dictionary.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                words.add(line);
            }
        } catch (Exception e) {
            System.out.println("Could not find the dictionary file");
            System.exit(0);
        }
    }

    public void initializeGame() {
        Scanner sc = new Scanner(System.in);
        setWord();
        System.out.println("Player 1: Enter number of misses allowed in this round: ");
        numberOfMisses = sc.nextInt();
        setRow();
        misses.delete(0, numberOfMisses);
        System.out.println("\nNOTE: Type \"exit\" if you want to end the game anytime or \"new\" to reset the game anytime !\nYou have "+ numberOfMisses + " guesses !\n");
        System.out.println("Player 2: Take over and start guessing");
    }

    private void setWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Enter the secret word to play with ");
        secretWord = sc.nextLine().toLowerCase();
    }

    private void setRow() {
        hangman = new char[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++) {
            if(secretWord.charAt(i) == ' ') {
                hangman[i] = ' ';
            } else {
                hangman[i] = '_';
            }
        }
    }

    public void showRow() {
        for (int i = 0; i < hangman.length; i++)
            System.out.print(hangman[i] + " ");
    }

    public void showMisses() {
        System.out.println(misses);
    }

    private boolean isCharInWord(char guess) {
        for (int i = 0; i < hangman.length; i++) {
            if (secretWord.charAt(i) == guess)
                return true;
        }
        return false;
    }

    private void changeRow(char guess) {
        for (int i = 0; i < hangman.length; i++) {
            if (secretWord.charAt(i) == guess) {
                hangman[i] = secretWord.charAt(i);
            }
        }

    }

    private void addToMisses(char guess) {
        misses.append(guess);
    }

    public void checkRow(char guess) {
        if (isCharInWord(guess)) {
            changeRow(guess);
        } else {
            if (!misses.toString().contains(""+guess)) {
                addToMisses(guess);
            } else {
                System.out.println("You have already guessed '" + guess + "' before!!!\nGuess some other letter");
            }
        }
    }

    public boolean isLooser() {
        if (misses.length() >= (numberOfMisses))
            return true;
        return false;
    }

    public boolean IsWinner() {
        for (int i = 0; i < hangman.length; i++)
            if (hangman[i] == '_')
                return false;
        return true;
    }

    public String getSecretWord() {
        return secretWord;
    }
}
