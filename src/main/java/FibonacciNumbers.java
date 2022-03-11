public class FibonacciNumbers {

    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        int count = 10;
        for (int i = 0; i < count; i++) {
            numbers.append(fibonacci(i)).append(", ");
        }
        numbers.deleteCharAt(numbers.length() - 2);
        System.out.print(numbers);
    }

    private static int fibonacci(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
