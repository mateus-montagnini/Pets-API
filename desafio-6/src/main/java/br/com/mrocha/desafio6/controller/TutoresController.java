package br.com.mrocha.desafio6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutores")
public class TutoresController {

    @PostMapping
    public void cadastrar() {

    }

//    @GetMapping
//    public void listar() {
//
//    }
}
