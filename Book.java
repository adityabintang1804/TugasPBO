public class Book extends Item {
    private String author;
    private int pageCount;

    public Book(String title, String itemID, String author) {
        super(title, itemID);
        this.author = author;
    }

    public Book(String title, String itemID, String author, int pageCount) {
        this(title, itemID, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (ID: " + itemID + ")");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}