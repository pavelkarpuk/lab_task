import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {15, -10, -5, 25, 16, 1, -100, 9, 7, 7};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            int tmp = array[left];
            array[left] = array[min];
            array[min] = tmp;
        }
    }
}
