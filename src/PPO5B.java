// Napisz program pozwalający na sprawdzenie, które liczb całkowitych z przedziału <1,100>
// są podzielne przez 9. Wypisz te liczby na ekranie monitora.
// Wykonaj program w trzech wariantach: while, do while, for.


// WHILE LOOP
public class PPO5B {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if (i % 9 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
