package data;

public class Ksiazki {

        private String title;
        private String author;
        private int pages;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Ksiazki(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }



    @Override
    public String toString() {
        return "Tytul: " + getTitle() + " autor: " + getAuthor() + " liczba stron: " + getPages();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ksiazki)) return false;

        Ksiazki ksiazki = (Ksiazki) o;

        if (getPages() != ksiazki.getPages()) return false;
        if (getTitle() != null ? !getTitle().equals(ksiazki.getTitle()) : ksiazki.getTitle() != null) return false;
        return getAuthor() != null ? getAuthor().equals(ksiazki.getAuthor()) : ksiazki.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getPages();
        return result;
    }
}
