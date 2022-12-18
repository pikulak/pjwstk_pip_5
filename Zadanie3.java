import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // Napisz metodę, która otrzymuje liczbę całkowitą n jako jej parametr.
        // Jeżeli n jest parzysta to odejmij od niej 1.
        // Wyświetl wzór choinki o podstawie n *.

        // Przykład dla n = 5:
        //     *
        //    ***
        //   *****


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTree(n);
    }


    public static void printTree(int n) {
        if (n % 2 == 0) {
            n--;
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}