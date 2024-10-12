public abstract class Item {
    protected String title;
    protected String itemID;

    public Item(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    // Abstract method untuk polimorfisme
    public abstract void displayInfo();

    // Getter dan Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
}