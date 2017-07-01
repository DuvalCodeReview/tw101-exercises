package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        int bookCount = 0;
        printStream.println("Book(s) containing \"" + partialBookTitle + "\":");

        for (String book : books) {
            if (book.contains(partialBookTitle)) {
                printStream.println(book);
                bookCount += 1;
            }
        }

        if (bookCount == 0) {
            printStream.println("none");
        }

        printStream.println();
    }
}
