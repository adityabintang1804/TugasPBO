public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "B001", "John Doe");
        Book book2 = new Book("Data Structures", "B002", "Jane Smith", 500);
        Magazine magazine1 = new Magazine("Tech Today", "M001", "2023-10-01");
        LibraryMember member1 = new LibraryMember("Alice Johnson", "LM001", "Gold");

        Item[] items = {book1, book2, magazine1};
        for (Item item : items) {
            item.displayInfo();
        }

        System.out.println("\nUpdating book information:");
        book1.setAuthor("John Doe Jr.");
        System.out.println("New author of " + book1.getTitle() + ": " + book1.getAuthor());

        System.out.println("\nLibrary Member Information:");
        member1.displayInfo();
    }
}