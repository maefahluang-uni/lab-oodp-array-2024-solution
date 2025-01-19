package lab.oodp.moreclass.test;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.moreclass.books.*;




public class TestBook {
    private BookProgram br;
     @Before
	    public void setup() {
	        br = new BookProgram();
	    }

	    private ByteArrayOutputStream outContent;

        @Before
	    public void setUpStreams() {
	        outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	    }

	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }

        @Test
        public void testStart(){
             br.start();
            String newline = System.getProperty("line.separator");
            assertEquals("Book Collection" + newline
            + "================" + newline
            + "Pride and Prejudice (1813), 432 pages, Author: Jane Austen" + newline
            + "To Kill a Mockingbird (1960), 281 pages, Author: Harper Lee" + newline
            + "1984 (1949), 328 pages, Author: George Orwell" + newline
            + "The Great Gatsby (1925), 180 pages, Author: F. Scott Fitzgerald" + newline
            + "Moby Dick (1851), 635 pages, Author: Herman Melville" + newline
            + "War and Peace (1869), 1225 pages, Author: Leo Tolstoy" + newline
            + "The Catcher in the Rye (1951), 214 pages, Author: J.D. Salinger" + newline
            + "The Hobbit (1937), 310 pages, Author: J.R.R. Tolkien" + newline
            + "The Road (2006), 287 pages, Author: Cormac McCarthy" + newline
            + "The Book Thief (2005), 552 pages, Author: Markus Zusak" + newline
            + newline
            + "The most recent book is: The Road (2006), 287 pages, Author: Cormac McCarthy" + newline
            + "The longest book is: War and Peace (1869), 1225 pages, Author: Leo Tolstoy" + newline
            + "1984 was written by George Orwell" + newline
            + "The Alchemist is not in the collection." + newline
            + "The Hobbit was written by J.R.R. Tolkien", outContent.toString().trim());
        }

}
