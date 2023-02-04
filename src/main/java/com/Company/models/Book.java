package com.Company.models;

public class Book {
    private long book_id;
    private long person_id;
    private String name;
    private String author_full_name;
    private int year_of_pub;

    public Book() {}

    public Book(long book_id, long person_id, String name, String author_full_name, int year_of_pub) {
        this.book_id = book_id;
        this.person_id = person_id;
        this.name = name;
        this.author_full_name = author_full_name;
        this.year_of_pub = year_of_pub;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_fio() {
        return author_full_name;
    }

    public void setAuthor_fio(String authorFullName) {
        this.author_full_name = authorFullName;
    }

    public int getYear_of_pub() {
        return year_of_pub;
    }

    public void setYear_of_pub(int year_of_pub) {
        this.year_of_pub = year_of_pub;
    }
}
