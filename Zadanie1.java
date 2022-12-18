import java.util.Scanner;

public class Zadanie1 {
    // Napisz program w Javie, który odczyta liczbę całkowitą n z konsoli.
    // Następnie przekaż tę wartość do metody, która wyświetla liczby od 0 do n.
    // Zauważ, że w przypadku, gdy n jest ujemne, metoda powinna wyświetlać liczby
    // ujemne w kolejności malejącej, zaczynając od 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(n);


    }
    public static void printNumbers(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= n; i--) {
                System.out.println(i);
            }
        }
    }
}