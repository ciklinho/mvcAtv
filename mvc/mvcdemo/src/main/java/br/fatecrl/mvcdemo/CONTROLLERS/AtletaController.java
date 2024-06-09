package br.fatecrl.mvcdemo.CONTROLLERS;

import br.fatecrl.mvcdemo.MODELS.Atleta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AtletaController {

    private static final List<Atleta> atletas = new ArrayList<Atleta>();

    public AtletaController() {
        atletas.add(new Atleta("Futebol", "Neymar", "100", "100"));
        atletas.add(new Atleta("Basquete", "Lebron", "50", "50"));
        atletas.add(new Atleta("MMA", "Charles Oliveira", "2", "2"));
    }

    @GetMapping
    public String getAtletas(Model model) {

        model.addAttribute("atletas", atletas);
        return "atletas";
    }
}






