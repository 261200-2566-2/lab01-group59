// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner GetAmount = new Scanner(System.in);
        System.out.print("Enter your amount of numbers:");
        int n = GetAmount.nextInt();
        int[] num = new int[n];
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < n; i++){
            System.out.print("Enter your numbers:");
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            num[i] = GetAmount.nextInt();
        }
        GetAmount.close();
        Arrays.sort(num);
        System.out.println("Sorted numbers:");
        for(int i = 0; i < n; i++){
            System.out.println(num[i]);
        }
    }
}