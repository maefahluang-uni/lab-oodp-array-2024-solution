package lab.oodp.moreclass.books;



public class BookProgram {

    public  void start(){
        //@TODO 1: Construct the array of Book 10 objects
        Book[] books = new Book[10];

        // Step 2: Uncomment the lines of constructors
        books[0] = new Book("Pride and Prejudice", 1813, 432, "Jane Austen");
        books[1] = new Book("To Kill a Mockingbird", 1960, 281, "Harper Lee");
        books[2] = new Book("1984", 1949, 328, "George Orwell");
        books[3] = new Book("The Great Gatsby", 1925, 180, "F. Scott Fitzgerald");
        books[4] = new Book("Moby Dick", 1851, 635, "Herman Melville");
        books[5] = new Book("War and Peace", 1869, 1225, "Leo Tolstoy");
        books[6] = new Book("The Catcher in the Rye", 1951, 214, "J.D. Salinger");
        books[7] = new Book("The Hobbit", 1937, 310, "J.R.R. Tolkien");
        books[8] = new Book("The Road", 2006, 287, "Cormac McCarthy");
        books[9] = new Book("The Book Thief", 2005, 552, "Markus Zusak");

        System.out.println("Book Collection");
        System.out.println("================");
        printBooksArray(books);
        System.out.println();
        System.out.println("The most recent book is: " + getMostRecentBook(books));
        System.out.println("The longest book is: " + getLongestBook(books));

        printAuthor("1984", books);
        printAuthor("The Alchemist", books);
        printAuthor("The Hobbit", books);
    } 
  

    public static void printBooksArray(Book[] books) {
        // TODO: 3 Implement this method
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static Book getMostRecentBook(Book[] books) {
        // TODO: 4 Implement this method
        Book mostRecent = books[0]; // Assume the first book is the most recent initially
        for (int i = 1; i < books.length; i++) {
            if (books[i].isMoreRecentThan(mostRecent)) {
            mostRecent = books[i]; // Update if a more recent book is found
            }
        }
        return mostRecent;
    }

    public static Book getLongestBook(Book[] books) {
        // TODO: 5 Implement this method
        Book longest = books[0]; // Assume the first book is the longest initially
        for (int i = 1; i < books.length; i++) {
            if (books[i].isLongerThan(longest)) {
            longest = books[i]; // Update if a longer book is found
            }
         }
        return longest;
    }

    public static void printAuthor(String bookTitle, Book[] books) {
        // TODO: 6. Implement this method
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
               System.out.println(bookTitle + " was written by " + book.getAuthor());
              found = true;
              break; // Exit the loop once the book is found
            }
        }

        if (!found) {
            System.out.println(bookTitle + " is not in the collection.");
        }
    }

    public static void main(String[] args) {
        new BookProgram().start();
      
    }

}
