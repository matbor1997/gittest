// Napisz program wykorzystujący tablicę, Wczytaj 10 elementów do tablicy, wyświetl wartości.
// Następnie wykorzystaj instrukcję wyboru i wykonaj działania:
// a. suma elementów nieparzystych tablicy
// b. suma elementów tablicy podzielnych przez 5
// c. iloczyn elementów parzystych tablicy
// d. suma kwadratów liczb nieparzystych

import java.util.Arrays;
import java.util.Scanner;

public class PPO6 {

    public static void main(String[] args) {

        // pobieranie wartosci
        Scanner valueChecker = new Scanner(System.in);

        System.out.println("Podaj pierwsza wartosc: ");
        int value1 = valueChecker.nextInt();
        System.out.println("Podaj druga wartosc: ");
        int value2 = valueChecker.nextInt();
        System.out.println("Podaj trzecia wartosc: ");
        int value3 = valueChecker.nextInt();
        System.out.println("Podaj czwarta wartosc: ");
        int value4 = valueChecker.nextInt();
        System.out.println("Podaj piata wartosc: ");
        int value5 = valueChecker.nextInt();
        System.out.println("Podaj szosta wartosc: ");
        int value6 = valueChecker.nextInt();
        System.out.println("Podaj siodma wartosc: ");
        int value7 = valueChecker.nextInt();
        System.out.println("Podaj osma wartosc: ");
        int value8 = valueChecker.nextInt();
        System.out.println("Podaj dziewiata wartosc: ");
        int value9 = valueChecker.nextInt();
        System.out.println("Podaj dziesiata wartosc: ");
        int value10 = valueChecker.nextInt();

        // deklaracja z inicjalizacją
        int [] set = new int [10];

        // przypisanie wartości
        set [0] = value1;
        set [1] = value2;
        set [2] = value3;
        set [3] = value4;
        set [4] = value5;
        set [5] = value6;
        set [6] = value7;
        set [7] = value8;
        set [8] = value9;
        set [9] = value10;

        System.out.println(Arrays.toString(set));

        // wyswietlenie mozliwych dzialan i zapytanie, ktora instrukcja ma byc wykonana

        Scanner actionCheck = new Scanner(System.in);
        System.out.println("Ktore dzialanie chcesz wykonac: \nA. Zsumowanie elementow nieparzystych tablicy.\nB. Zsumowanie elementow tablicy podzielnych przez 5.\nC. Pomnozenie parzystych elementow tablicy.\nD. Zsumowanie kwadratow liczb nieparzystych.");

        String action = actionCheck.nextLine();

        // instrukcje wyboru dzialania

        switch (action) {

            // A. Zsumowanie elementow nieparzystych tablicy.
            case "A","A.","a","a.":
                int sumaA = 0;
                for (int i = 0 ; i < set.length ; i++) {
                    if (set[i] % 2 == 1) {
                        sumaA = sumaA + set[i];
                    }
                }
                System.out.println("Wynikiem tego dzialania jest: "+ sumaA);
                break;
            case "B","B.","b","b.":

                // B. Zsumowanie elementow tablicy podzielnych przez 5.
                int sumaB = 0;
                for (int i = 0 ; i < set.length ; i++) {
                    if (set[i] % 5 == 0) {
                        sumaB = sumaB + set[i];
                    }
                }
                System.out.println("Wynikiem tego dzialania jest: " + sumaB);
                break;

                // C. Pomnozenie parzystych elementow tablicy.
            case "C","C.","c","c.":
                int iloczynC = 1;
                for (int i = 0 ; i < set.length ; i++) {
                    if (set[i] % 2 == 0) {
                        iloczynC = iloczynC * set[i];
                    }
                }
                System.out.println("Wynikiem tego dzialnia jest: " + iloczynC);
                break;

                // D. Zsumowanie kwadratow liczb nieparzystych.
            case "D","D.","d","d.":
                int sumaD = 0;
                for (int i = 0 ; i < set.length ; i++) {
                    if (set[i] % 2 == 1) {
                        sumaD = sumaD + (set[i] * set[i]);
                    }
                }
                System.out.println("Wynikiem tego dzialania jest: " + sumaD);
                break;
            default:
                System.out.println("Nie moge wykonac takiego dzialania.");
        }
    }
}
