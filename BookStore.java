import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookStore {
    private String[] bookTitles;
    private int size;

    public BookStore(int capacity) {
        bookTitles = new String[capacity];
        size = 0;
    }

    // Add a Book Title
    public void addBookTitle(String title) {
        if (size == bookTitles.length) {
            // Resize array if needed
            bookTitles = Arrays.copyOf(bookTitles, size * 2);
        }
        bookTitles[size++] = title;
    }

    // Remove a Book Title
    public void removeBookTitle(String title) {
        int index = searchBookTitle(title);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                bookTitles[i] = bookTitles[i + 1];
            }
            bookTitles[size - 1] = null;
            size--;
        }
    }

    // Search for a Book Title
    public int searchBookTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (bookTitles[i].equals(title)) {
                return i;
            }
        }
        return -1;
    }

    // List All Book Titles
    public void listAllBookTitles() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookTitles[i]);
        }
    }

    // Sort Book Titles
    public void sortBookTitles() {
        List<String> list = new ArrayList<>(Arrays.asList(bookTitles));
        list.subList(0, size).sort(null);
        list.toArray(bookTitles);
    }

    // Main method for testing
    public static void main(String[] args) {
        BookStore library = new BookStore(5);
        
        library.addBookTitle("Rich dad poor dad");
        library.addBookTitle("Atomeic Habite");
        library.addBookTitle("Market Wizards");
        library.addBookTitle("One Up On Wall Street");

        System.out.println("All Book Titles:");
        library.listAllBookTitles();
        
        System.out.println("\nSorting Book Titles...");
        library.sortBookTitles();
        library.listAllBookTitles();
        
        System.out.println("\nSearching for 'Market Wizards':");
        int index = library.searchBookTitle("Market Wizards");
        System.out.println(index != -1 ? "Found at index: " + index : "Not found");
        
        System.out.println("\nRemoving 'Market Wizards'...");
        library.removeBookTitle("Market Wizards");
        library.listAllBookTitles();
    }
}



