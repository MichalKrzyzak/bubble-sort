import java.util.*;

/**
 * Created by Michał Krzyżak
 * 21.4.2019
 */

class UserChoice {
    void verifyUserChoice(String userChoice, Scanner userInput) {
        Sort sort = new Sort();
        List<Integer> listOfNumbers = new ArrayList<>();

        if (userChoice.equals("1")) {
            System.out.println("Please enter your numbers dividing them by \",\"");
            String userNumbers = userInput.nextLine();
            listOfNumbers = splitUserNumbers(userNumbers);
            sort.sortNumbers(listOfNumbers);
        } else if (userChoice.equals("2")) {
            Random random = new Random();
            for (int i = 0; i < random.nextInt((100) + 1); i++) {
                listOfNumbers.add(random.nextInt(9999));
            }
            System.out.println("Generated numbers: " + String.valueOf(listOfNumbers));
            sort.sortNumbers(listOfNumbers);
        } else if (userChoice.equalsIgnoreCase("exit") || userChoice.equalsIgnoreCase("q")) {
            System.out.println("Exiting...");
            Thread.interrupted();
        } else {
            System.out.println("Wrong input!");
        }
    }

    private List<Integer> splitUserNumbers(String userNumbers) {
        List<String> userNumbersList = Arrays.asList(userNumbers.split(","));
        List<Integer> userIntegerNumbers = new ArrayList<>();

        for (String userNumber : userNumbersList) {
            userIntegerNumbers.add(Integer.valueOf(userNumber));
        }

        return userIntegerNumbers;
    }
}
