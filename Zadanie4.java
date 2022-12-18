import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        // Napisz metodę w Javie, której parametrami będą 3 liczby całkowite.
        // Następnie metoda wyświetla następujący wzór:
        // NIE UŻYWAJ TYPÓW STRING I ZWIĄZANYCH Z NIMI BIBLIOTEK.
        // Gdzie x = 5, y = 3, z = 8

        // Wzór:
        //     *
        //     *
        //     *
        // *   *
        // *   *
        // * * *
        // * * *
        // * * *

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        printPattern(x, y, z);
    }

    public static void printPattern(int x, int y, int z) {

    }
}
