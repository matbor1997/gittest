// Napisz program wyznaczający wartość podanej funkcji:
//        [4x dla x > 1        ]
// F(x) = [-10 dla x = 7       ]
//        [(x+1)^2 dla x < - 10]
//        [0 dla innych x      ]

import java.util.Scanner;

public class PPO8 {
    public static void main(String[] args) {

        // pobranie argumentu x
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc x: ");
        int x = scanner.nextInt();

        // wyznaczenie wartosci dla podanego argumentu
        if (x == 7) {
            int y = 2*x;
            System.out.println("Funkcja dla tego argumentu przyjmuje wartosc: " + y);
        } else if (x > 1) {
            int y = -10;
            System.out.println("Funkcja dla tego argumentu przyjmuje wartosc: " + y);
        } else if (x < -10) {
            int y = (x+1)*(x+1);
            System.out.println("Funkcja dla tego argumentu przyjmuje wartosc: " + y);
        } else {
            int y = 0;
            System.out.println("Funkcja dla tego argumentu przyjmuje wartosc: " + y);
        }
    }
}
