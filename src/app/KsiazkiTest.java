package app;

import data.Ksiazki;
import read.KsiazkiReader;

public class KsiazkiTest {
    public static void main(String[] args) {

        int tablicaLength = 3;
        int zmienna = 0;

        Ksiazki[] ksiazki = new Ksiazki[3];
        KsiazkiReader ksiazkiReader = new KsiazkiReader();


            for (int i = 0; i < 3; i++) {
                System.out.println("Wprowadź książkę numer: " + (i + 1));
                ksiazki[i] = ksiazkiReader.stworzKsiazki();
            }

                do {
                    if (ksiazki[1].equals(ksiazki[0])) {
                        System.out.println("Wykryto Duplikat");
                        zmienna = 1;
                        System.out.println("Wprowadź ponownie książkę numer: " + 2);
                        ksiazki[1] = ksiazkiReader.stworzKsiazki();
                    }

                    if (ksiazki[2].equals(ksiazki[0])) {
                        System.out.println("Wykryto Duplikat");
                        zmienna = 1;
                        System.out.println("Wprowadź ponownie książkę numer: " + 3);
                        ksiazki[2] = ksiazkiReader.stworzKsiazki();
                        break;
                    }

                    if (ksiazki[2].equals(ksiazki[1])) {
                        System.out.println("Wykryto Duplikat");
                        zmienna = 1;
                        System.out.println("Wprowadź ponownie książkę numer: " + 3);
                        ksiazki[2] = ksiazkiReader.stworzKsiazki();
                        break;
                    }
                } while (zmienna == 1);



        System.out.println("\nWszystkie dostepne książki to: ");
        for (Ksiazki ksiazki1 : ksiazki) {
            System.out.println(ksiazki1);
        }
    }
}
