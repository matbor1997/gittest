/* napisz program ktory poprosi o 2 liczby,
a nastepnie wykona na nich podstawowe operacje matematyczne */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();

        int wynikDodawania = firstNumber + secondNumber;
        System.out.println("Wynikiem dodawania " + firstNumber + " i " + secondNumber + " jest " + wynikDodawania + ".");
        int wynikOdejmowania = firstNumber - secondNumber;
        System.out.println("Wynikiem odejmowania " + firstNumber + " i " + secondNumber + " jest " + wynikOdejmowania + ".");
        int wynikMnozenia = firstNumber * secondNumber;
        System.out.println("Wynikiem mnozenia " + firstNumber + " i " + secondNumber + " jest " + wynikMnozenia + ".");
        int wynikDzielenia = firstNumber / secondNumber;
        System.out.println("Wynikiem dzielenia  " + firstNumber + " i " + secondNumber + " jest " + wynikDzielenia + ".");
        int wynikDzieleniaModulo = firstNumber % secondNumber;
        System.out.println("Wynikiem dzielenia modulo " + firstNumber + " i " + secondNumber + " jest " + wynikDzieleniaModulo + ".");

    }

}
