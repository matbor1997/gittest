/* Zapytaj uzytkownika o wiek
W przypadku gdy ma mniej niz 18 lat,
wypisz na ekranie informacje,
ze nie moze kupic alkoholu.
Gdy ma wiecej niz 18 lat,
to podziekuj za zakupy. */

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj swoj wiek: ");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println("Zapraszamy na zakupy :)");
        } else {
            System.out.println("Alkohol sprzedawany jest wylacznie osobom pelnoletnim.");
        }
    }

}
