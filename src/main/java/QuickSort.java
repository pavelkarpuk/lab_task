import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {15, -10, -5, 25, 16, 1, -100, 9, 7, 7};
        int leftBorder = 0;
        int rightBorder = array.length - 1;

        quickSort(array, leftBorder, rightBorder);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int leftBorder, int rightBorder) {
        if (array.length == 0) return;
        if (leftBorder >= rightBorder) return;

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
    }
}
