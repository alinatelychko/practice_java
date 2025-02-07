package org.example;

import org.example.Entity.Books;

import java.util.List;

public class Main {
    public static void main(String[] args) {
BooksHelper booksHelper = new BooksHelper();

//        Books[] booksArray = {
//                new Books(1,"Джоан Роулинг", 320, 50000, 1997),
//                new Books(2,"Джордж Оруэлл", 328, 30000, 1949),
//                new Books(3,"Фёдор Достоевский", 672, 20000, 1866),
//                new Books(4,"Лев Толстой", 1225, 15000, 1869),
//                new Books(5,"Джейн Остин", 432, 25000, 1813),
//                new Books(6,"Михаил Булгаков", 504, 18000, 1967),
//                new Books(7,"Артур Конан Дойл", 307, 22000, 1892),
//                new Books(8,"Габриэль Гарсиа Маркес", 417, 28000, 1967),
//                new Books(9,"Эрнест Хемингуэй", 127, 16000, 1952),
//                new Books(10,"Рэй Брэдбери", 249, 21000, 1953)
//        };
//
//        for (Books books : booksArray) {
//            booksHelper.add(books);
//        }

        List<Books> booksList = booksHelper.getBooksOver150pages();

        if (!booksList.isEmpty()) {
            for (Books book : booksList) {
                System.out.println(book);
            }
        } else {
            System.out.println("Нет книг с количеством страниц больше 150.");
        }

    }
}