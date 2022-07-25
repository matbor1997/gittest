/* Umozliwia cykliczne wykonywanie
ciagu instrukcji okreslona ilosc razy */

public class PetlaForRef {

    public static void main(String[] args) {
        int number = 100;
        // i -> specjalna zmienna sterujaca
        for (int i = 0; i < number; i = i + 2) {
            System.out.println(i);
        }
        // i -> specjalna zmienna sterujaca
        for (int i = 0; i < number; i++) {
            if (i%5 == 0)
                System.out.println(i);
        }
        for (int j = 0; j < number; j++) {
            System.out.println("Bede robil prace domowe");
        }
    }
}
