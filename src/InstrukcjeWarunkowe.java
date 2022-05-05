/* instrukcje warunkowe pozwalaja nam okreslac,
ktore czesci kodu maja zostac wykonane,
gdy zostanie spelniony warunek */

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0;
        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + (dzielna/dzielnik));
        } else {
            System.out.println("Prosze podac inna liczbe.");
        }
    }
}