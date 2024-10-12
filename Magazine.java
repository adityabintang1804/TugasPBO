public class Magazine extends Item {
    private String issueDate;

    public Magazine(String title, String itemID, String issueDate) {
        super(title, itemID);
        this.issueDate = issueDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + " (ID: " + itemID + "), Issue Date: " + issueDate);
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}