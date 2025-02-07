package org.example;


import org.example.Entity.Books;

import java.util.List;

public interface Methods {

 void add(Books books);
 void remove(Books books);

 List<Books> getBooksOver150pages();

}
