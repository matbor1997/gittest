// Napisz program wykorzystujący funkcje.
// Ma zawierać dwie funkcje:
// Jedna o nazwie osoba, zawierająca dane: imię, nazwisko, miejscowość, stanowisko.
// Druga obliczająca pensję na podstawie liczby przepracowanych godzin, jeżeli pracownik przepracował do 200 godzin,
// to za każdą godzinę otrzymuje 20 zł.
// Powyżej 200 przepracowanych godzin ma liczone jako nadgodziny i za każdą godzinę otrzymuje 30 zł.
// Do wypłaty pensja + ewentualne nadgodziny.

import java.util.Scanner;

public class PPO10 {

    // funkcja ta wyswietla dane uzytkownika
    public static void osoba(String name, String surname, String residence, String position) {
        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Miasto: " + residence);
        System.out.println("Stanowisko: " + position);
    }

    // funkcja ta wylicza nalezna pensje wraz z ewentualnymi nadgodzinami
    public static void pensja(float hours) {
        float pensja = 0;
            if (hours > 200) {
                float overtimeValue = (hours - 200) * 30;
                pensja = 4000 + overtimeValue;
                System.out.println("Twoja pensja wynosi: " + pensja + ".");
            } else {
                pensja = hours * 20;
                System.out.println("Twoja pensja wynosi: " + pensja + ".");
            }
        System.out.println();
        }

    public static void main(String[] args) {

        // program pobiera dane osobowe oraz przepracowane godziny od uzytkownika,
        // po czym wykorzystuje powyzsze metody dla podsumowania

        Scanner valueProvide = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = valueProvide.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = valueProvide.nextLine();
        System.out.println("Podaj swoje miasto: ");
        String residence = valueProvide.nextLine();
        System.out.println("Podaj zajmowane stanowisko: ");
        String position = valueProvide.nextLine();

        Scanner hoursProvide = new Scanner(System.in);
        System.out.println("Ile godzin przepracowales: ");
        float hours = valueProvide.nextFloat();

        osoba(name, surname, residence, position);
        pensja(hours);
    }
}
