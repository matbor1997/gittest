public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        // inkrementacja -> zwiekszenie wartosci o jeden

        int a = 0;
        System.out.println("Wartosc a: " + a); // 0
        int b = ++a;
        System.out.println("Wartosc b: " + b); // 1
        System.out.println("Wartosc a: " + a); // 1
        int c = a++;
        System.out.println("Wartosc c: " + c); // 1
        System.out.println("Wartosc a: " + a); // 2

        //dekrementacja -> zmniejszenie wartosci o jeden

        int d = 0;
        System.out.println("Wartosc d: " + d); // 0
        int e = d--;
        System.out.println("Wartosc e: " + e); // 0
        System.out.println("Wartosc d: " + d); // -1
        int f = --d;
        System.out.println("Wartosc f: " + f); // -2
        System.out.println("Wartosc d: " + d); // -2


    }
}
