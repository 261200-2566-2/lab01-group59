// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner GetAmount = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = GetAmount.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your numbers:");
            numbers[i] = GetAmount.nextInt();
        }

        GetAmount.close();
        sortAndPrintNumbers(numbers);
    }

    // Method
    public static void sortAndPrintNumbers(int[] numbers) {
        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
