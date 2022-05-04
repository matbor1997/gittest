import java.util.Scanner;

public class ScannerRef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result + "!");
    /*}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie: ");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    }*/
    }
}