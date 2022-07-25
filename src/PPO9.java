// Napisz program pozwalający obliczyć objętość, pole powierzchni całkowitej
// oraz łączną długość wszystkich krawędzi prostopadłościanu.
// Dane wejściowe mają być wprowadzone z klawiatury, wyniki wyświetlone na ekranie monitora.
// Do obliczeń oraz operacji wejścia/wyjścia wykorzystaj funkcje.
// Dane wejściowe należy dostarczyć do funkcji za pomocą parametrów przekazywanych przez wartość.
// Obliczone wartości funkcji powinny być przekazywane do otoczenia  za pośrednictwem nazw funkcji

import java.util.Scanner;

public class PPO9 {

    // metoda z funkcja przyjmujaca wartosci, ktora pozwala obliczyc parametry prostopadloscianu
    public static void prostopadloscian(int baseEdge1, int baseEdge2, int lateralEdge) {
        float volume = baseEdge1 * baseEdge2 * lateralEdge;
        float surface = (2 * baseEdge1 * baseEdge2) + (2 * baseEdge1 * lateralEdge) + (2 * baseEdge2 * lateralEdge);
        float edgesLenght = (4 * baseEdge1) + (4 * baseEdge2) + (4 * lateralEdge);

        System.out.println("Objetosc twojego prostopadloscianu jest rowna: " + volume + " jednostek szesciennych.");
        System.out.println("Pole powierzchni calkowitej twojego prostopadloscianu jest rowne: " + surface + " jednostek kwadratowych.");
        System.out.println("Laczna dlugosc wszystkich krawedzi twojego prostopadloscianu jest rowna: " + edgesLenght + " jednostek.");
    }

    // metoda glowna pobierajaca wartosci od uzytkownika do funkcji prostopadloscian
    public static void main(String[] args) {
        Scanner valueProvide = new Scanner(System.in);
        System.out.println("Podaj dlugosc pierwszej krawedzi podstawy: ");
        int baseEdge1 = valueProvide.nextInt();
        System.out.println("Podaj dlugosc drugiej krawedzi podstawy: ");
        int baseEdge2 = valueProvide.nextInt();
        System.out.println("Podaj dlugosc krawedzi bocznej: ");
        int lateralEdge = valueProvide.nextInt();

        prostopadloscian(baseEdge1, baseEdge2, lateralEdge);
    }
}
