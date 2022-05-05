public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = 12;

        if (number == 0) {
            System.out.println("Liczba jest rowna zero");
        } else if (number > 10) {
            System.out.println("Numer wiekszy od 10");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number > 10) {
            System.out.println("Numer wiekszy od 10");
        } else {
            System.out.println("Zaden warunek nie zostal spelniony");
        }
    }
}
