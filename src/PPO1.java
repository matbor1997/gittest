//Napisz program umożliwiający obliczenie pola i obwodu trójkąta równoramiennego.
//Dane wejściowe: długość podstawy i wysokości należy zainicjować w programie, wyniki zaprezentować w konsoli.

import java.util.Scanner;

public class PPO1 {
    public static void main(String[] args) {

        // pobranie wartosci od uzytkownika
        Scanner valueProvide = new Scanner(System.in);

        System.out.println("Podaj dlugosc podstawy trojkata: ");
        float baseLenght = valueProvide.nextFloat();
        System.out.println("Podaj wysokosc trojkata: ");
        float heightLenght = valueProvide.nextFloat();
        System.out.println("Podaj dlugosc ramienia bocznego trojkata: ");
        float legLenght = valueProvide.nextFloat();

        // wyliczanie pola i obwodu oraz wyswietlanie wynikow
        float triangleArea = (baseLenght*heightLenght)/2;
        float trianglePerimeter = (2*legLenght+heightLenght);
        System.out.println("Pole twojego trojkata jest rowne: " + triangleArea + ", " + "a obwod twojego trojkata jest rowny: " + trianglePerimeter + ".");
    }
}
