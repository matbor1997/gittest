// umozliwiaja wykonanie podstawowych operacji matematycznyc
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber/secondNumber; // 0.66
        int mod = secondNumber%firstNumber; //  ile 4 miesci sie w 6 = 1, reszta z dzielenia to 2


       /* System.out.println("Wynik dodawania jest rowny: " + addition);
        System.out.println("Wynik odejmowania jest rowny: " + subtraction);
        System.out.println("Wynik mnozenia jest rowny: " + multiplication);
        System.out.println("Wynik dzielenia jest rowny: " + division);
        System.out.println("Wynik dzielenia modulo jest rowny: " + mod); */

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber; // firstNumber = firstNumber * secondNumber
        System.out.println("Po mnozeniu " + firstNumber);
        firstNumber/=secondNumber; // firstNumber = firstNumber / secondNumber
        System.out.println("Po dzieleniu " + firstNumber);
        firstNumber%=secondNumber; // firstNumber = firstNumber % secondNumber
        System.out.println("Po dzieleniu modulo: " + firstNumber);

    }
}
