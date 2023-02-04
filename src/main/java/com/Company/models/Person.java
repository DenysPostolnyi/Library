package com.Company.models;

public class Person {
    private long person_id;
    private String full_name;
    private int year_of_birth;

    public Person() {}

    public Person(long person_id, String full_name, int year_of_birth) {
        this.person_id = person_id;
        this.full_name = full_name;
        this.year_of_birth = year_of_birth;
    }

    public Person(String full_name, int year_of_birth) {
        this.full_name = full_name;
        this.year_of_birth = year_of_birth;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
