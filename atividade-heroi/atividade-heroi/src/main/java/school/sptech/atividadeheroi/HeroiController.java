package school.sptech.atividadeheroi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class HeroiController {
    private List<Heroi> herois = new ArrayList<Heroi>();

    @GetMapping("/herois")
    public List<Heroi> getHerois() {
        return herois;
    }

    @GetMapping("/herois/{indice}")
    public Heroi getHeroi(@PathVariable int indice) {
        if (indice < 0 || indice >= herois.size()) {
            return null;
        }
        return herois.get(indice);
    }

    @GetMapping("/herois/cadastrar/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public Heroi cadastrarHeroi(
            @PathVariable String nome,
            @PathVariable String habilidade,
            @PathVariable int idade,
            @PathVariable int forca,
            @PathVariable boolean vivo) {
        Heroi heroi = new Heroi(nome, habilidade, idade, forca, vivo);
        herois.add(heroi);
        return heroi;
    }

    @GetMapping("/herois/atualizar/{indice}/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public Heroi atualizarHeroi(
            @PathVariable int indice,
            @PathVariable String nome,
            @PathVariable String habilidade,
            @PathVariable int idade,
            @PathVariable int forca,
            @PathVariable boolean vivo) {
        if (indice < 0 || indice >= herois.size()) {
            return null;
        }
        Heroi heroi = herois.get(indice);
        heroi = new Heroi(nome, habilidade, idade, forca, vivo);
        herois.set(indice, heroi);
        return heroi;
    }

    @GetMapping("/herois/remover/{indice}")
    public String removerHeroi(@PathVariable int indice) {
        if (indice < 0 || indice >= herois.size()) {
            return "Herói não encontrado";
        }
        herois.remove(indice);
        return "Herói removido";
    }
}
