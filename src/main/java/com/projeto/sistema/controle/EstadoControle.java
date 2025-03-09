package com.projeto.sistema.controle;

import com.projeto.sistema.modelos.Estado;
import com.projeto.sistema.repositorios.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EstadoControle {
    @Autowired
    private EstadoRepositorio estadoRepositorio;

    @GetMapping("/cadastroEstado")
    public ModelAndView cadastrar(Estado estado) {//Será responsável por gerar nossa visualização
        ModelAndView mv = new ModelAndView("administrativo/estados/cadastro");//caminho de pasta.
        mv.addObject("estado", estado);
        return mv;
    }

}
