package com.charlywilliams.factGenerator.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                         // Tells Spring this is a REST controller
@RequestMapping("/api")                 // Base URL path
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular dev server to access it
public class FactController {

    @GetMapping("/fact")                // API endpoint: /api/fact
    public String getFact() {
        return "Cats are the best!🐈";  // Text returned to Angular
    }

}
