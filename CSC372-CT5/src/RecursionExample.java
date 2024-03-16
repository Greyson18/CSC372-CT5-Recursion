import java.util.Scanner;

public class RecursionExample {

    // Recursive method to calculate the product of numbers in an array
    public static int calculateProduct(int[] numbers, int index) {
        // Base case: if the index is less than 0, return 1
        if (index < 0) {
            return 1;
        }
        // Recursive case: calculate the product of the current number and the product of the rest of the numbers
        return numbers[index] * calculateProduct(numbers, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the five numbers
        int[] numbers = new int[5];

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the product using the recursive method
        int product = calculateProduct(numbers, 4);

        // Display the result
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }
}