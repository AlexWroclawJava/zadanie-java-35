package read;

import data.Ksiazki;
import java.util.Scanner;


public class KsiazkiReader {

        Scanner scanner = new Scanner(System.in);

            public void zamknijSkaner() {
            scanner.close();
            }

        public Ksiazki stworzKsiazki() {
            System.out.println("Tytuł: ");
            String title = scanner.nextLine();
            System.out.println("Autor: ");
            String author = scanner.nextLine();
            System.out.println("Liczba stron: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            return new Ksiazki(title, author, pages);
        }

}
