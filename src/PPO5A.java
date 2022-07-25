// Napisz program pozwalający na sprawdzenie, które liczb całkowitych z przedziału <1,100>
// są podzielne przez 9. Wypisz te liczby na ekranie monitora.
// Wykonaj program w trzech wariantach: while, do while, for.


// FOR LOOP
public class PPO5A {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i = i + 1) {
            if (i % 9 == 0)
                System.out.println(i);
        }
    }
}
