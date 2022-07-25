//Napisz program zawierający definicję stałej nazwanej Pi.
// Wykorzystaj tę stałą do wyznaczenie obwodu i pola powierzchni koła.
// Dane wejściowe tj. promień kuli mają być wprowadzanie z klawiatury.
// Zabezpiecz program przed wykonywaniem obliczeń dla promienia o długości niedodatniej.
// W przypadku błędnych wartości powinien zostać wyświetlony odpowiedni komunikat

import java.util.Scanner;

public class PPO2 {
    public static void main(String[] args) {

        // zdefiniowanie stalej
        float numberPi = 3.14F;

        // pobranie wartosci promienia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc promienia: ");
        float rValue = scanner.nextInt();

        // wyznaczenie objetosci i pola powierzchni kuli oraz wyswietlenie wyniku
        float volumeSphere = 4/3 * numberPi * (rValue*rValue*rValue) ;
        float areaSphere = 4 * numberPi * (rValue*rValue);
        if (rValue <= 0) {
            System.out.println("Promien nie moze byc mniejszy, badz rowny zero.");
        } else {
            System.out.println("Pole Twojej kuli jest rowne: " + areaSphere + ", zas objetosc Twojej kuli jest rowna: " + volumeSphere + ".");
        }
    }
}
