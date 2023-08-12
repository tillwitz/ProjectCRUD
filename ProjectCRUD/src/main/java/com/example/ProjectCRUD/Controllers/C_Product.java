package com.example.ProjectCRUD.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Chefe do controle de estoque dos produtos
@RequestMapping("/Product") //Estou solicitando no mapa produtos
public class C_Product {
    @GetMapping //Estou pegando no Mapa de produtos requisições específicas
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("deu ok");
    }
}
