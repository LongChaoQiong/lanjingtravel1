package org.lanqiao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class SearchApp {
    public static void main(String[] args) {
        SpringApplication.run(SearchApp.class);
    }
    @RequestMapping("/")
    public String search(){
       return "Welcome to search.";
    }
}