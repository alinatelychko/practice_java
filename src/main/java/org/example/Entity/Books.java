package org.example.Entity;

import jakarta.persistence.*;


@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;


    private int pageCount;

    private int printRun;

    private int publicationYear;



    public Books(int id, String author, int pageCount, int printRun, int publicationYear) {
        this.id = id;
        this.author = author;
        this.pageCount = pageCount;
        this.printRun = printRun;
        this.publicationYear = publicationYear;
    }

public Books (){}

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrintRun() {
        return printRun;
    }

    public void setPrintRun(int printRun) {
        this.printRun = printRun;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", printRun=" + printRun +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
