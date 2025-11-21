package com.murillo.app_teste.app_teste_sem_banco;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teste-app")
public class TesteController {

    @GetMapping
    public ResponseEntity<String> testeApp() {
        return ResponseEntity.ok("Teste de aplicação sem banco de dados funcionando!");
    }
}
