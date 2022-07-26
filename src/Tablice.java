public class Tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Mateusz";
        imiona[1] = "Bartek";
        imiona[2] = "Piotr";

//        System.out.println(imiona[0]);
//        System.out.println(imiona[1]);
//        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[] {1, 7, 13, 15, 29, 33};
//        System.out.println(lottoNumbers[1]);
//        System.out.println(lottoNumbers[3]);
//        System.out.println(lottoNumbers[5]);
//        System.out.println(lottoNumbers.length);

// iterowanie po elemntach tablicy lottoNumbers w celu wyswietlenia jej zawartosci
        for (int i=0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }

// iterowanie po elementach tablicy imiona w celu wyswietlenia jej zawartosci
        for (int i=0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }
    }
}
