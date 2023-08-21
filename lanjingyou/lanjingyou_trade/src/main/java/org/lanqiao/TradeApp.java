package org.lanqiao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class TradeApp {
    public static void main(String[] args) {
        SpringApplication.run(TradeApp.class);
    }

    @RequestMapping("/")
    public String trade(){
       return "Welcome to trade.";
    }
}