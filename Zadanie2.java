import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        // Napisz metodę, która otrzymuje liczbę całkowitą n jako jej parametr.
        // Następnie oblicza n-nty wyraz ciągu Fibonacciego i wyświetla go w konsoli.
        // Wykorzystaj pętle inną, niż w zadaniu 1.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));

    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}