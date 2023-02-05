package com.Company.dao;

import com.Company.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    // add book to DB
    public void addBook(Book book){
        jdbcTemplate.update("INSERT INTO Book (book_name, author_full_name, year_of_pub) VALUES (?, ?, ?)", book.getName(), book.getAuthorFullName(), book.getYearOfPub());
    }

    // get book
    public Book getBook(long id){
        return jdbcTemplate.query("SELECT * FROM Book WHERE book_id=?", new Object[]{id}, new BookMapper()).stream().findAny().orElse(null);
    }

    // update
    public void updateBook(long id, Book book){
        jdbcTemplate.update("UPDATE Book SET book_name=?, author_full_name=?, year_of_pub=? WHERE book_id=?", book.getName(), book.getAuthorFullName(), book.getYearOfPub(), id);
    }

    //delete book
    public void deleteBook(long id){
        if(getBook(id) != null){
            jdbcTemplate.update("DELETE FROM Book WHERE book_id=?", id);
        }
    }
}