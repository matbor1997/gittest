// umozliwiaja wykonanie podstawowych operacji matematycznyc
public class OperatoryMatematyczneRef {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik dodawania jest rowny: " + addition);
        System.out.println("Wynik odejmowania jest rowny: " + subtraction);
        System.out.println("Wynik mnozenia jest rowny: " + multiplication);
        System.out.println("Wynik dzielenia jest rowny: " + division);
        System.out.println("Wynik dzielenia modulo jest rowny: " + mod);

        firstNumber+=secondNumber; // firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnozeniu " + firstNumber);
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu " + firstNumber);
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po dzieleniu modulo: " + firstNumber);
    }
}
