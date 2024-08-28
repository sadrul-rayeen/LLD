package Items;

/*
 * Open close principle
 * Open for extension
 * Close for modification
 * It means if you change any code in Book class there is no impact on LibraryItem interface
 */

public class Book implements LibraryItem {
    private String title;
    private String uniqueId;
    private String author;
    private double value;

    public Book(String title, String uniqueId, String author, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFees(int days) {
        return days * 10;
    }

    @Override
    public double getValue() {
        return this.value;
    }

}
