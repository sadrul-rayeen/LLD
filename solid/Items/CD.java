package Items;

public class CD implements LibraryItem {
    private String title;
    private String uniqueId;
    private String artist;
    private double value;

    public CD(String title, String uniqueId, String artist, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
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
        return days * 20;
    }

    @Override
    public double getValue() {
        return this.value;
    }

}
