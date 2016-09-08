package ProstyPortal;

import java.util.ArrayList;

class Portal {
    private ArrayList<String> polaPolozenia;

    void setPolaPolozenia(int[] ppol) {
        ArrayList<String> ppol;
    }

    String sprawdz(String ruch) {

        String wynik = "pudlo";

        int indeks = polaPolozenia.indexOf(ruch);

        if (indeks >= 0) {
            polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }
}