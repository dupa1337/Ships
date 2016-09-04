package ProstyPortal;

import java.util.Scanner;

public class ProstyPortalTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iloscRuchow = 0;
        ProstyPortal portal = new ProstyPortal();
        int poczatekPortalu = (int) (Math.random() * 5);
        int[] polozenia = {poczatekPortalu, poczatekPortalu + 1, poczatekPortalu + 2};

        portal.setPolaPolozenia(polozenia);
        boolean czyIstnieje = true;
        while (czyIstnieje) {
            System.out.println("Podaj pole");
            String wybranePole = scanner.nextLine();
            iloscRuchow++;
            String wynik = portal.sprawdz(wybranePole);
            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println("Zrobiles " + iloscRuchow + " ruchow");
            }
        }
    }
}