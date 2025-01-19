Lab - Class & Array
==========

Before you start
----------
The purpose of this lab is to practice how to create and use class, as well as array.


Exercise One - Patterns
--------------------
The skeleton code is found in the ``` lab.oodp.moreclass.pattern```  package. Open the file ``` PrintPatternProgram.java``` . This class creates an instance of the ``` Pattern```  class and calls its methods to print different patterns.

The Pattern class defines a pattern. It consists of two instance variables:

    symbol – the character used in the pattern.
    repetitions – the number of times the symbol is repeated.

Complete the ```Pattern.java```  with the following features:
1. Constructor 
   - A constructor that accepts the number of repetitions and the symbol. For example: ```new Pattern(5, '*') ``` creates a pattern that prints ```*****``` .
2. toString() Method
   - Returns a string representation of the pattern. For example, return ```*****``` if the symbol is ```*``` and repetitions are 5.


Complete the ``` PrintPatternProgram.java```  with the following features:
1. printPatternOne() Method
   - ``` printPatternOne()```  - Uncooment the code in the method to make it work. The method prints out the pattern as shown below (To comment/uncomment on VS code, select the comment lines and press Shift+Ctrl+C)
2. printPatternTwo() method 
   - ``` printPatternTwo()``` P - prints the second pattern, as in the sample output below. This method must create ​ Pattern ​ objects in a similar way to the printPatternOne()​ method using Pattern class. You have to include a for-loop that is already there.

You may try to run ``` PrintPatternProgram``` , it should give the results as below.

```
Pattern One:
*****
@@@@@
#####
Pattern two
*
**
***
****
*****
```

:rocket: **Note: This exercise will be marked with ```TestPattern.java```, please try to run and confirm the results with this test script.**

Exercise Two - Mobile Phones
------------------------------
The skeleton code is found in the ​ lab.oodp.moreclass.mobilephones package.
Complete the ​ MobilePhone class, and uncomment the marked lines in DisplayMobilePrices.java so that when ​ DisplayMobilePrices ​ is run, it produces the
following output:

```
Jonathan has an Apple iPhone 4 which cost $899.95
Ann has an LG Optimus-P970 which cost $699.95
Adriana has a Nokia N97 which cost $599.55
Alastair has now purchased a new Apple iPhone 4 for $899.95
Alastair has the same type as Jonathan
Adriana wants a new phone
```

You need to declare the 3 instance variables for brand, model and price, and write the following methods:
- The ​ MobilePhone()​ constructor
- The ​ getPrice()​ and ​ setPrice() ​ methods
- The ​ toString() ​ method
- The ​ getModel()​ and ​ setModel()​ methods
- The ​ equals()​ method that takes another MobilePhone object and checks if brand, model and price are equal.
- The​ isCheaperThan()​ method that takes another MobilePhone object and compare the price.


:rocket: **Note: This exercise will be marked with TestMobilePhone.java, please try to run and confirm the results with this test script.**

Exercise Three - Movies
---------------------------------
The skeleton code is found in the lab.oodp.moreclass.books package. Complete the code in BookProgram.java as outlined in Steps 1–5 below so that it produces the following output when you run the program. 
The Book.java class is provided, and you do not need to modify it.

Expected Output
```
Book Collection
================
Pride and Prejudice (1813), 432 pages, Author: Jane Austen
To Kill a Mockingbird (1960), 281 pages, Author: Harper Lee
1984 (1949), 328 pages, Author: George Orwell
The Great Gatsby (1925), 180 pages, Author: F. Scott Fitzgerald
Moby Dick (1851), 635 pages, Author: Herman Melville
War and Peace (1869), 1225 pages, Author: Leo Tolstoy
The Catcher in the Rye (1951), 214 pages, Author: J.D. Salinger
The Hobbit (1937), 310 pages, Author: J.R.R. Tolkien
The Road (2006), 287 pages, Author: Cormac McCarthy
The Book Thief (2005), 552 pages, Author: Markus Zusak

The most recent book is: The Road (2006), 287 pages, Author: Cormac McCarthy
The longest book is: War and Peace (1869), 1225 pages, Author: Leo Tolstoy

1984 was written by George Orwell
The Alchemist is not in the collection.
The Hobbit was written by J.R.R. Tolkien
```

Instructions
```BookProgram.java```
1. Declare an array of 10 ​ Book objects.
2. Uncomment the lines of constructors
3. Write the ```printBooksArray()``` Method
   - This method takes an array of Book objects as a parameter and prints all the elements as shown in the output.
   - Use the toString() method in the Book class to format each book's details.
4. Write the ```getMostRecentBook()``` Method
   - This method takes an array of Book objects as a parameter and returns the most recent book.
   - Use the ```isMoreRecentThan()``` method in the Book class to compare publication years.

5. Write the ```getLongestBook()```g Method
   - This method takes an array of Book objects as a parameter and returns the longest book.
   - Use the ```isLongerThan()``` method in the Book class to compare the number of pages.

6. Write the ```printAuthor()``` Method
   - This method takes two parameters: the name of a book and an array of Book objects.
   - Search the array for the book with the given name.
   - If found, print the author of the book.
   - If not found, print "not in the collection".


:rocket: **Note: This exercise will be marked with TestBook.java, please try to run and confirm the results with this test script.**

Submit this lab
------------------
:octocat: Don't forget to push your project to Github. Please make sure your project's classroom workflow is successfully executed. You may refer to the lab2's "Submit this lab", as a guideline for checking submission.

