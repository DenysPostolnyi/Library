# Library

Application for library management

## Задача:

The local library wants to switch to digital accounting of books. You need to develop a web application for them. Librarians should be able to register readers, lend books to them, and free books (after the reader returns the book to the library).
<hr>

## Entity:

Person (fields: Full name (UNIQUE), year of birthday) <br>
Book (fields: name, author, year) <br>
Relationship between entities: One to Many. <br>
Person can have many books. The book may belong only one person.
In DB must be two tables - Person and Book. For all tables 
set automatically generation of id.
<hr>

## Necessary functions:

1) Pages for creating, updating and deleting person.
2) Pages for creating, updating and deleting book
3) Page with list of all people (people are clickable - after click on person it must redirect to page with info about
   this person).
4) Page with list of all books (books are clickable - after click on book it must redirect to page with info about this book).
5) Page of person which show all values of him fields and list of books which he took. If person doesn't take any book, it must print text "He hasn't taken book yet".
6) Page of book which show all values of book's fields and full name of person who took this book. If book isn't taken, it must print text "This book is free".
7) If somebody takes book, on book's page near person's name must be "Free book" button. This button is knocked by librarian when person bring this book back, book become free and deleting from person's list of books.
8) On the page of the book, if the book is free, there should be a drop-down list (select) with all people and the "Choose person" button. This button is pressed by the librarian when the person wants to take this book home. The book must be included in the list of person's book.
9) All fields must validate with @Valid and @Spring Validator, if it's necessary.

<hr>

## Screenshots of pages

### Page with list of all peoples (url: /people)
![img_15.png](img/img_15.png)

### Page for creating new person (url: /people/new)
![img_14.png](img/img_14.png)

### Page for updating person (url: /people/{id}/edit)
![img_16.png](img/img_16.png)

### Page with list of books (utl: /books)
![img_17.png](img/img_17.png)

### Page for creating new book (url: /books/new)
![img_18.png](img/img_18.png)

### Page for updating book (url: /books/{id}/edit)
![img_19.png](img/img_19.png)

### Page for info about person (url: /person/{id})
Person who didn't take book
![img_20.png](img/img_20.png)
Person who took book
![img_21.png](img/img_21.png)

### Page for info about book (url: /books/{id})
Book in library and free
![img_22.png](img/img_22.png)

Choosing person
![img_23.png](img/img_23.png)

Person took this book
![img_24.png](img/img_24.png)
