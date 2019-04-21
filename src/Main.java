import java.util.Scanner;

/**
 * Created by Michał Krzyżak
 * 21.4.2019
 */

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Bubble Sort!\nIf you have your own numbers press 1, if you want to sort randomly generated numbers press 2.\nTo exit, enter \"Exit\" or \"q\".");
        String userChoice = userInput.nextLine();
        new UserChoice().verifyUserChoice(userChoice, userInput);
    }
}
