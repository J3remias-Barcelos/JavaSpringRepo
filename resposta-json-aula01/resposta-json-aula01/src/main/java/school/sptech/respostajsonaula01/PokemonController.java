package school.sptech.respostajsonaula01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class PokemonController {
    private List<String> pokemons = new ArrayList<>();

    @GetMapping("/pokemon")
    public String totalPokemon() {
        return "Total de pokemon cadastrados: " + pokemons.size();
    }

    @GetMapping("/pokemon/cadastrar/{nome}")
    public String cadastrarPokemon(@PathVariable String nome) {
        pokemons.add(nome);
        return "Pokemon cadastrado";
    }

    public boolean existePokemon(int indice) {
        if (indice >= 0 && indice < pokemons.size()) {
            return true;
        }
        return false;
    }

    @GetMapping("/pokemon/recuperar/{indice}")
    public String recuperarPokemon(@PathVariable int indice) {
        if (existePokemon(indice)) {
            return pokemons.get(indice);
        }
        return "Pokemon não encontrado";
    }

    @GetMapping("/pokemon/excluir/{indice}")
    public String excluirPokemon(@PathVariable int indice) {
        if (existePokemon(indice)) {
            pokemons.remove(indice);
            return "Excluído";
        }
        return "Pokemon não encontrado";
    }

    @GetMapping("/pokemon/atualizar/{indice}/{novoNome}")
    public String atualizarPokemon(@PathVariable int indice, @PathVariable String novoNome) {
        if (existePokemon(indice)) {
            pokemons.set(indice, novoNome);
            return "Pokemon Atualizado";
        }
        return "Pokemon não encontrado";
    }
}
