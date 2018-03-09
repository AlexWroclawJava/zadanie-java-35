package read;

import data.Ksiazka;

import java.util.Scanner;

public class KsiazkiUtils {

    Scanner scanner = new Scanner(System.in);

    public Ksiazka stworzKsiazke() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Liczba stron: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Ksiazka(title, author, pages);
    }

    public boolean alreadyExists(Ksiazka[] ksiazki, Ksiazka ksiazka) {
        boolean result = false;
        for (Ksiazka k : ksiazki) {
            if(k!=null && k.equals(ksiazka)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
