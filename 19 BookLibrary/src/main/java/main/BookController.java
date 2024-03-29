package main;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import response.Book;

import java.util.List;

@RestController
public class BookController {

    //@RequestMapping(value = "/books/", method = RequestMethod.GET)
    @GetMapping("/books/")
    public List<Book> list(){
        return Storage.getAllBooks();
    }

    //@RequestMapping(value = "/books/", method = RequestMethod.POST)
    @PostMapping("/books/") // более короткая запись
    public int add(Book book){
        return Storage.addBook(book);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity get(@PathVariable int id){
        Book book = Storage.getBook(id);
        if (book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return new ResponseEntity(book, HttpStatus.OK);
    }
}
