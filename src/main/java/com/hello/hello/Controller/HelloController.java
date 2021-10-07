package com.hello.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Definindo a arquitetura REST
@RestController
@RequestMapping("/hello")
public class HelloController {
    // Mapeando GET: quando algum local chamar GET,
    // este método será executado
    @GetMapping
    public String Hello(){
        return "Hello World em Spring!";
    }
}
