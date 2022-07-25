// Napisz program, ktory wykorzysta instrukcje wyboru
// do zrobienia kalkulatora obliczajacego pola
// rombu, trojkata, trapezu i rownolegloboku.

import java.util.Scanner;

public class PPO7 {
    public static void main(String[] args) {

        System.out.println("Ten program sluzy do obliczania pola rombu, trojkata, trapezu, badz rownolegloboku.");

        // pobranie nazwy figury, ktorej pole chcesz obliczyc
        Scanner scanner = new Scanner(System.in);
        System.out.println("Figura, ktorej pole chce obliczyc to: ");
        String figure = scanner.nextLine();

        // instrukcja wyboru dla wybranej figury
        switch (figure) {
            case "romb", "Romb":
                Scanner RhombCheck = new Scanner(System.in);
                System.out.println("Podaj wartosc e: ");
                float eRhomb = RhombCheck.nextFloat();
                System.out.println("Podaj wartosc f: ");
                float fRhomb = RhombCheck.nextFloat();
                float resultRhomb = (eRhomb*fRhomb)/2;
                System.out.println("Pole twojego rombu jest rowne: " + resultRhomb + ".");
                break;

            case "trojkat", "Trojkat", "trójkąt", "Trójkąt":
                Scanner TriangleCheck = new Scanner(System.in);
                System.out.println("Podaj wartosc a: ");
                float aTriangle = scanner.nextFloat();
                System.out.println("Podaj wartosc h: ");
                float hTriangle = TriangleCheck.nextFloat();
                float resultTriangle = (aTriangle*hTriangle)/2;
                System.out.println("Pole twojego trojkata jest rowne: " + resultTriangle + ".");
                break;

            case "trapez", "Trapez":
                Scanner TrapezeCheck = new Scanner(System.in);
                System.out.println("Podaj wartosc a: ");
                float aTrapeze = TrapezeCheck.nextFloat();
                System.out.println("Podaj wartosc b: ");
                float bTrapeze = TrapezeCheck.nextFloat();
                System.out.println("Podaj wartosc h: ");
                float hTrapeze = TrapezeCheck.nextFloat();
                float resultTrapeze = ((aTrapeze+bTrapeze)*hTrapeze)/2;
                System.out.println("Pole twojego trapezu jest rowne: " + resultTrapeze + ".");
                break;

            case "rownoleglobok", "Rownoleglobok", "równoległobok", "Równoległobok":
                Scanner RhomboidCheck = new Scanner(System.in);
                System.out.println("Podaj wartosc a: ");
                float aRhomboid = RhomboidCheck.nextFloat();
                System.out.println("Podaj wartosc h: ");
                float hRhomboid = RhomboidCheck.nextFloat();
                float resultRhomboid = aRhomboid*hRhomboid;
                System.out.println("Pole twojego rownolegloboku jest rowne: " + resultRhomboid + ".");
                break;

            default:
                System.out.println("Przepraszamy, program nie oblicza pola tej figury.");
        }
    }
}
