package ClassesAndObjects;

import java.time.LocalDate;

public class Journal {
    private String title;
    private String publisher;
    private String issn;
    private LocalDate editionDate;
    private double price;
    private int numberOfPages;

    public Journal(String title, String publisher, String issn, LocalDate editionDate, double price, int numberOfPages) {
        this.title = title;
        this.publisher = publisher;
        this.issn = issn;
        this.editionDate = editionDate;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title.length() > 3) {
            this.title = title;
        } else  {
            System.out.println("O título deve ter mais de 3 caracteres.");
        }
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }
    public LocalDate getEditionDate() {
        return editionDate;
    }
    public void setEditionDate(LocalDate editionDate) {
        this.editionDate = editionDate;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else  {
            System.out.println("Preço deve ser um valor positivo.");
        }
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("O número de páginas não pode ser negativo.");
        }
    }

    public void printInfo() {
        System.out.println("Título: " + this.title);
        System.out.println("Editora: " + this.publisher);
        System.out.println("ISSN: " + this.issn);
        System.out.println("Data da edição: " + this.editionDate);
        System.out.println("Preço: " + this.price);
        System.out.println("Número de páginas: " + this.numberOfPages);
    }
}
