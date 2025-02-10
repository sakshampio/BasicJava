package exceptions;

public class Exception {

        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException

                int result = 10 / 0; // This will cause an ArithmeticException
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println("An error occurred: " + e.getMessage());

        }
    }
}
