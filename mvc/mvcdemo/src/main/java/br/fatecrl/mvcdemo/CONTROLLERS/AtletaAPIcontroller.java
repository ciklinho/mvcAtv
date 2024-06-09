package br.fatecrl.mvcdemo.CONTROLLERS;


import br.fatecrl.mvcdemo.MODELS.Atleta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/atletas")
public class AtletaAPIcontroller {

    private static final List<Atleta> atletas = new ArrayList<Atleta>();

    public AtletaAPIcontroller() {
        atletas.add(new Atleta("Futebol", "Neymar", "100", "100"));
        atletas.add(new Atleta("Basquete", "Lebron James", "50", "50"));
        atletas.add(new Atleta("MMA", "Charles Oliveira", "2", "2"));
    }

    @GetMapping

    public List<Atleta> getAtletas() {
        return atletas;
    }
}
