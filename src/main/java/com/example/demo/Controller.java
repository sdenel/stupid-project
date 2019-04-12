package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
public class Controller {
    //    Local file include bien moche
    @GetMapping("/")
    String helloWorld(@RequestParam String fichier, @RequestParam String myxss) throws IOException {
        BufferedReader bufferreader = new BufferedReader(new FileReader("/home/simon/.ssh/" + fichier));
        String line;
        StringBuilder answer = new StringBuilder();
        while ((line = bufferreader.readLine()) != null) {
//            line = bufferreader.readLine();
            System.out.println(line);
            answer.append(line);
        }
        System.out.println(answer);
        return "hey: " + answer + myxss;
    }
}
