// Napisz program umożliwiający obliczenie sumy kolejnych liczb całkowitych,
// począwszy od zadanej liczby początkowej L1, a skończywszy na zadanej liczbie końcowej L2.
// Liczby L1 i L2 maja być wprowadzone z klawiatury.
// W Obliczeniach należy:
// oddzielnie uwzględnić liczby parzyste i nieparzyste.
// Wykonaj program w trzech wariantach wykorzystując: while, do while, for.

import java.util.Scanner;

// WARIANT DO WHILE LOOP

public class PPO4C {
    public static void main(String[] args) {

        // pobranie L1 i L2
        Scanner valueCheck = new Scanner(System.in);

        System.out.println("Podaj pierwsza wartosc: ");
        int value1 = valueCheck.nextInt();
        System.out.println("Podaj druga wartosc: ");
        int value2 = valueCheck.nextInt();

        // obliczanie sumy kolejnych liczb calkowitych
        int sumEven = 0;
        int sumOdd = 0;
        int i = value1;

        do {
            if (i % 2 == 0) {
                i = i + 1;
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        while (i <= value2);
        System.out.println("Suma liczb parzystych jest rowna: " + sumEven);
        System.out.println("Suma liczb nieparzystych jest rowna: " + sumOdd);
    }
}
