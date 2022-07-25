// Napisz program umożliwiający obliczenie sumy kolejnych liczb całkowitych,
// począwszy od zadanej liczby początkowej L1, a skończywszy na zadanej liczbie końcowej L2.
// Liczby L1 i L2 maja być wprowadzone z klawiatury.
// W Obliczeniach należy:
// oddzielnie uwzględnić liczby parzyste i nieparzyste.
// Wykonaj program w trzech wariantach wykorzystując: while, do while, for.

import java.util.Scanner;

// WARIANT WHILE LOOP

public class PPO4B {
    public static void main(String[] args) {

        // pobranie L1 i L2
        Scanner valueCheck = new Scanner(System.in);

        System.out.println("Podaj pierwsza wartosc: ");
        int value1 = valueCheck.nextInt();
        System.out.println("Podaj druga wartosc: ");
        int value2 = valueCheck.nextInt();

        // obliczanie sumy kolejnych liczb calkowitych
        int sumOdd = 0;
        int sumEven = 0;
        int i = value1;

        while (i <= value2) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
            i = i + 1;
        }
        System.out.println("Suma liczb parzystych jest rowna: " + sumEven);
        System.out.println("Suma liczb nieparzystych jest rowna: " + sumOdd);
    }
}