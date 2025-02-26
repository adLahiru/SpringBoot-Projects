package lk.ijse.cmjd.LibMgmt2025.controller;

import lk.ijse.cmjd.LibMgmt2025.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/book")

public class BookController {

    @GetMapping("/health")
    public String healthTest() {
        return "Book Controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBook(@RequestBody BookDTO book) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBook(@RequestParam("bookIdKey") String bookIdValue) {
        System.out.println(bookIdValue);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{BookId}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable("BookId") String bookId, @RequestBody BookDTO bookDTO) {
        System.out.println(bookId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{BookId}")
    public ResponseEntity<BookDTO> getSelectedBook(@PathVariable("BookId") String bookId) {
        System.out.println("Get selected book  for book id " + " " + bookId);
        return ResponseEntity.ok(new BookDTO("B005",
                "Spring boot",
                "John Doe",
                "2nd Edition",
                "Springer",
                "978-3-16-148410-0",
                50.0,
                100,
                75,
                "2023-10-12",
                "15:30:00"));
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO("B001", "Effective Java", "Joshua Bloch", "3rd Edition", "Pearson", "9780134685991", 39.99, 50, 45, "2023-10-01", "12:00:00"));
        bookList.add(new BookDTO("B002", "Clean Code", "Robert C. Martin", "1st Edition", "Prentice Hall", "9780132350884", 29.99, 30, 25, "2023-10-02", "14:00:00"));
        bookList.add(new BookDTO("B003", "Head First Design Patterns", "Eric Freeman", "2nd Edition", "O'Reilly Media", "9781492078005", 49.99, 20, 18, "2023-10-03", "10:00:00"));
        bookList.add(new BookDTO("B004", "Java: The Complete Reference", "Herbert Schildt", "12th Edition", "McGraw Hill", "9781260463415", 59.99, 40, 35, "2023-10-04", "11:00:00"));
        bookList.add(new BookDTO("B005", "Spring in Action", "Craig Walls", "5th Edition", "Manning", "9781617294945", 44.99, 60, 50, "2023-10-05", "15:00:00"));
        return ResponseEntity.ok(bookList);
    }


}

