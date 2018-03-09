package app;

import data.Ksiazka;
import read.KsiazkiUtils;

import java.util.Scanner;

public class KsiazkiTest {

    public static void main(String[] args) {

        int liczba_ksiazek;
        KsiazkiUtils ksiazkiUtils = new KsiazkiUtils();

        System.out.println("Ile książek chcesz wprowadzić do bazy danych? ");
        Scanner scanner = new Scanner(System.in);
        liczba_ksiazek = scanner.nextInt();
        scanner.nextLine();

        Ksiazka[] ksiazki = new Ksiazka[liczba_ksiazek];
        int i = 0;
            do {
                System.out.println("\nWprowadź książkę numer: " + (i + 1));
                Ksiazka newksiazka = ksiazkiUtils.stworzKsiazke();

                while (ksiazkiUtils.alreadyExists(ksiazki, newksiazka)) {
                    System.out.println("Wprowadzono duplikat, proszę spróbuj ponownie");
                    newksiazka = ksiazkiUtils.stworzKsiazke();
                }

                ksiazki[i] = newksiazka;
                i++;
            } while (i < liczba_ksiazek);

            System.out.println("\nWszystkie dostepne książki w bazie to: ");
            for (Ksiazka ksiazka1 : ksiazki) {
                System.out.println(ksiazka1);
            }
    }
}