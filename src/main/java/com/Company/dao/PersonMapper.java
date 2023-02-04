package com.Company.dao;

import com.Company.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rst, int rowNum) throws SQLException {
        Person person = new Person();
        person.setPerson_id(rst.getLong("person_id"));
        person.setFull_name(rst.getString("full_name"));
        person.setYear_of_birth(rst.getInt("year_of_birth"));
        return person;
    }

}
