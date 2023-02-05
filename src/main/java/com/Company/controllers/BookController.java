package com.Company.controllers;


import com.Company.dao.BookDAO;
import com.Company.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookDAO bookDAO;

    @Autowired
    public BookController(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    // adding book
    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book){
        return "/books/new";
    }

    @PostMapping()
    public String addBook(@ModelAttribute("book") Book book){
        bookDAO.addBook(book);
        return "redirect:/";
    }

    // updating book
    @GetMapping("/{id}/edit")
    public String changeBook(@PathVariable("id") long id, Model model){
        model.addAttribute("book", bookDAO.getBook(id));
        return "books/update";
    }

    @PatchMapping("/{id}")
    public String updateBook(@ModelAttribute("book")Book book, @PathVariable("id") long id){
        bookDAO.updateBook(id, book);
        return "redirect:/";
    }

    // deleting book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable("id") long id){
        bookDAO.deleteBook(id);
        return "redirect:/";
    }
}
