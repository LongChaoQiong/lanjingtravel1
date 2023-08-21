package org.lanqiao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class BizApp {
    public static void main(String[] args) {
        SpringApplication.run(BizApp.class);
    }
    @RequestMapping("/")
    public String biz(){
       return "Welcome to biz.";
    }
}