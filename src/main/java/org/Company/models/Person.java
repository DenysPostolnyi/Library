package org.Company.models;

public class Person {
    private long id;
    private String fio;
    private int year_of_birth;

    public Person(long id, String fio, int year_of_birth) {
        this.id = id;
        this.fio = fio;
        this.year_of_birth = year_of_birth;
    }

    public Person(String fio, int year_of_birth) {
        this.fio = fio;
        this.year_of_birth = year_of_birth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
