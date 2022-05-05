public class InstrukcjaWarunkowaElseIfRef {

    public static void main(String[] args) {
        int number = 4;

        if (number > 0) {
            System.out.println("Liczba wieksza od zera");
        } else if (number < -10) {
            System.out.println("Liczba mniejsza od -10");
        } else if (number == 0) {
            System.out.println("Liczba rowna 0");
        } else {
            System.out.println("Liczba w przedziale 0 do -10");
        }
    }
}