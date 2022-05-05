/* operatory porownania porownuja elementy rownania
i zwracaja logiczne wartosci (true /false) */

public class OperatoryPorownaniaRef {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber;

        System.out.println(result);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
    }

}
