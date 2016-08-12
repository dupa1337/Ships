package ProstyPortal;

class ProstyPortal {
    String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole);

        String wynik = "pudlo";

        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "zatopiony";
        }
        System.out.println(wynik);

        return wynik;
    }
}