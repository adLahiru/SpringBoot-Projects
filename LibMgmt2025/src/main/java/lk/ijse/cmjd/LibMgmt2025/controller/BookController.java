package lk.ijse.cmjd.LibMgmt2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")

public class BookController {

    @GetMapping("/health")
    public  String healthTest(){
        return "Book Controller is running";
    }
}
