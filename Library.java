public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Malin Kundang", "B001", "Ahmad Danu");
        Book book2 = new Book("Tangkuban Parahu", "B002", "Agus Junaidi", 500);
        Magazine magazine1 = new Magazine("Anak Sehat", "M001", "2023-10-01");
        LibraryMember member1 = new LibraryMember("Asep", "LM001", "Gold");

        Item[] items = {book1, book2, magazine1};
        for (Item item : items) {
            item.displayInfo();
        }

        System.out.println("\nMemperbarui informasi buku:");
        book1.setAuthor("Ahmad Danu");
        System.out.println("Penulis baru dari " + book1.getTitle() + ": " + book1.getAuthor());

        System.out.println("\nInformasi Anggota Perpustakaan:");
        member1.displayInfo();
    }
}
