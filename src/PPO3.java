//Napisz program pozwalający obliczyć wartość wyrażenie zadanego wzorem:
//W=(a/a)+(c/a+b)-(a+c/a+b+d)
//Wartości a,b,c,d mają być prowadzone z klawiatury. Zabezpiecz przed dzieleniem przez zero.

import java.util.Scanner;

public class PPO3 {
    public static void main(String[] args) {

        System.out.println("Ten program oblicza wartosc wyrazenia (a/a)+(c/a+b)-(a+c/a+b+d)");

        // pobranie wartosci a
        Scanner aValue = new Scanner(System.in);
        System.out.println("Podaj wartosc a: ");
        float a = aValue.nextFloat();

        // pobranie reszty wartosci z warunkiem by nie dzielic przez zero
        if (a > 0 || a < 0) {
            Scanner bValue = new Scanner(System.in);
            System.out.println("Podaj wartosc b: ");
            float b = bValue.nextFloat();
            Scanner cValue = new Scanner(System.in);
            System.out.println("Podaj wartosc c: ");
            float c = cValue.nextFloat();
            Scanner dValue = new Scanner(System.in);
            System.out.println("Podaj wartosc d: ");
            float d = dValue.nextFloat();
            float result = (a / a) + (c / a + b) - (a + c / a + b + d);
            System.out.println(result);
        } else {
            System.out.println("Nie mozna dzielic przez 0");
        }
    }
}
