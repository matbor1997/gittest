public class InkrementacjaDekrementacjaRef {

    public static void main(String[] args) {
        // inkrementacja -> zwiekszenie wartosci o jeden

        int a = 0;
        System.out.println("Wartosc a: " + a);
        int b = a++;
        System.out.println("Wartosc b: " + b);
        System.out.println("Wartosc a: " + a);
        int c = ++a;
        System.out.println("Wartosc c: " + c);
        System.out.println("Wartosc a: " + a);

        //dekrementacja -> zmniejszenie wartosci o jeden
        int d = 0;
        System.out.println("Wartosc d: " + d);
        int e = d--;
        System.out.println("Wartosc e: " + e);
        System.out.println("Wartosc d: " + d);
        int f = --d;
        System.out.println("Wartosc f: " + f);
        System.out.println("Wartosc d: " + d);
    }
}
