import java.util.List;

/**
 * Created by Michał Krzyżak
 * 21.4.2019
 */

class Sort {

    void sortNumbers(List<Integer> numbers) {
        boolean isListSorted;
        int temp;

        do {
            isListSorted = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    temp = numbers.get(i + 1);
                    numbers.set(i + 1, numbers.get(i));
                    numbers.set((i), temp);
                    isListSorted = true;
                }
            }
        } while (isListSorted);

        System.out.println("Sorted numbers: " + String.valueOf(numbers));
    }

}
