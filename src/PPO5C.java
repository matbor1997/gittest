// Napisz program pozwalający na sprawdzenie, które liczb całkowitych z przedziału <1,100>
// są podzielne przez 9. Wypisz te liczby na ekranie monitora.
// Wykonaj program w trzech wariantach: while, do while, for.


// DO WHILE LOOP
public class PPO5C {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 9 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
        while (i <= 100);
    }
}
