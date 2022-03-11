package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 88, 54, 7, -1, 105);
        bubbleSortArrayList(numbers);
        System.out.println(numbers);
    }

    public static void bubbleSortArrayList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.size() - 1; j > i; j--) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    int temp = numbers.get(j - 1);
                    numbers.set(j - 1, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }
}
