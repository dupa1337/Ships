package ProstyPortal;

import java.util.Scanner;

public class ProstyPortalTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iloscRuchow = 0;
        ProstyPortal wit = new ProstyPortal();
        int poczatekPortalu = (int) (Math.random() * 5);
        int[] polozenia = {poczatekPortalu, poczatekPortalu + 1, poczatekPortalu + 2};
        wit.setPolaPolozenia(polozenia);
        boolean czyIstnieje = true;
        while (czyIstnieje) {
            System.out.println("Podaj pole");
            String wybranePole = scanner.nextLine();
            iloscRuchow ++;
            if (wit.sprawdz(wybranePole).equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println("Zrobiles " + iloscRuchow + " ruchow");
            }
        }
    }
}
      /*  String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
        if (wynik.equals("trafiony")) {
            wynikTestu = "zakonczony pomyslnie";
        }
        System.out.println(wynikTestu);
        String wynikTestu = "niepowodzenie";*/