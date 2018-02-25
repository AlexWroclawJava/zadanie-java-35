package app;
import compare.KsiazkiComparator;
import data.Ksiazki;
import read.KsiazkiReader;

import java.util.Scanner;

public class KsiazkiTest {

    public static void main(String[] args) {

        int liczba_ksiazek;
        KsiazkiReader ksiazkiReader = new KsiazkiReader();
        KsiazkiComparator ksiazkiComparator = new KsiazkiComparator();

        System.out.println("Ile książek chcesz wprowadzić do bazy danych? ");
        Scanner scanner = new Scanner(System.in);
        liczba_ksiazek = scanner.nextInt();
        scanner.nextLine();
        Ksiazki[] ksiazki = new Ksiazki[liczba_ksiazek];

        int i = 0;
            do {
                System.out.println("\nWprowadź książkę numer: " + (i + 1));
                ksiazki[i] = ksiazkiReader.stworzKsiazki();
                ksiazkiComparator.comparator(ksiazki, i);
                i++;
            } while (i < liczba_ksiazek);

            System.out.println("\nWszystkie dostepne książki w bazie to: ");
            for (Ksiazki ksiazki1 : ksiazki) {
                System.out.println(ksiazki1);
            }
    }
}