package com.projeto.sistema.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Define para o Spring identificar que no padrão MVC, isso é um 'Controller'
public class PrincipalControle {

    @GetMapping("/administrativo")
    public String acessarPrincipal() {
        return "administrativo/home"; //Caminho de pastas
    }
}
