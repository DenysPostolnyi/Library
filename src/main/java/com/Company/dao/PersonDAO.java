package com.Company.dao;

import com.Company.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    // add person to DB
    public void addPerson(Person person){
        jdbcTemplate.update("INSERT INTO Person (full_name, year_of_birth) VALUES (?, ?)", person.getFull_name(), person.getYear_of_birth());
    }

    // get one person from DB
    public Person getPerson(long id){
        return jdbcTemplate.query("SELECT * From Person WHERE person_id=?", new Object[]{id}, new PersonMapper()).stream().findAny().orElse(null);
    }

    //update person
    public void updatePerson(long id, Person person){
        jdbcTemplate.update("UPDATE Person SET full_name=?, year_of_birth=? WHERE person_id = ?",person.getFull_name(), person.getYear_of_birth(), id);
    }

    //delete person
    public void deletePerson(long id){
        if(getPerson(id) != null){
            jdbcTemplate.update("DELETE FROM Person WHERE person_id=?", id);
        }
    }

}
