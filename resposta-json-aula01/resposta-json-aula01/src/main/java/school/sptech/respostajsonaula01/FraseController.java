package school.sptech.respostajsonaula01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frases")
public class FraseController {

    @GetMapping
    public String fraseBacana() {
        return "Aula de Spring Boot";
    }

    @GetMapping("/outra/{nome}")
    public String fraseBacana2(@PathVariable String nome) {
        return "Seja bem vindo: " + nome;
    }

    @GetMapping("/outra/{nome}/{sobrenome}")
    public String fraseBacana3(@PathVariable String nome, @PathVariable String sobrenome) {
        return "Seja bem vindo: " + nome + " - " + sobrenome;
    }
}
