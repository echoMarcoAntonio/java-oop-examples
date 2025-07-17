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
        this.title = title;
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
        this.price = price;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
