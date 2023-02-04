package com.Company.controllers;

import com.Company.dao.PersonDAO;
import com.Company.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

    @Autowired
    public PeopleController (PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    // creating new person
    @GetMapping("/new")
    public String newPersson(@ModelAttribute("person") Person person){
        return "people/new";
    }

    @PostMapping()
    public String addPerson(@ModelAttribute("person") Person person){
        personDAO.addPerson(person);
        return "redirect:/";
    }

    // updating existing person
    @GetMapping("/{id}/edit")
    public String changePerson(@PathVariable("id") long id, Model model){
        model.addAttribute("person", personDAO.getPerson(id));
        return "people/update";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Person person, @PathVariable("id") long id){
        personDAO.updatePerson(id, person);
        return "redirect:/";
    }

    // deleting person
    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable("id") long id){
        personDAO.deletePerson(id);
        return "redirect:/";
    }
}
