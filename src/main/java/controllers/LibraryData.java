
package controllers;

import java.util.ArrayList;


public class LibraryData {


    public static ArrayList<Book> books = new ArrayList<>();


    public static int getTotalBooks() {
        int total = 0;

        for (Book book : books) {
            total += book.getQuantity();
        }

        return total;
    }


    public static int getUniqueBookCount() {
        return books.size();
    }
}
