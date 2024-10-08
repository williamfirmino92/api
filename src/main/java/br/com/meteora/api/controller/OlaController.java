package br.com.meteora.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ola")
public class OlaController {

    @GetMapping
    public String olaMundo() {
        return "Olá Mundo!";
    }

    // Olá Mundo

}
