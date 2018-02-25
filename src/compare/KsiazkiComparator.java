package compare;

import data.Ksiazki;
import read.KsiazkiReader;

public class KsiazkiComparator {

    boolean rezultat1 = true;
    int j = 0;

    public void comparator(Ksiazki[] ksiazki, int i) {
        KsiazkiReader ksiazkiReader = new KsiazkiReader();

        for (int j = 0; j <= i - 1; j++) {
            if (ksiazki[i].equals(ksiazki[j])) {
                String zdublowany = "duplikat";
                do {
                    System.out.println(zdublowany);
                    ksiazki[i] = ksiazkiReader.stworzKsiazki();
                } while ((ksiazki[i].equals(ksiazki[j]) || (ksiazki[i].equals(ksiazki[0]))) && j < i);
            }
        }
    }
}






