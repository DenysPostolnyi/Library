package com.Company.models;

public class Book {
    private long bookID;
    private long personId;
    private String name;
    private String authorFullName;
    private int yearOfPub;

    public Book() {}

    public Book(long bookID, long personId, String name, String authorFullName, int yearOfPub) {
        this.bookID = bookID;
        this.personId = personId;
        this.name = name;
        this.authorFullName = authorFullName;
        this.yearOfPub = yearOfPub;
    }

    public Book(String name, String authorFullName, int yearOfPub) {
        this.name = name;
        this.authorFullName = authorFullName;
        this.yearOfPub = yearOfPub;
    }

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }
}
