package school.sptech.projeto02verboshttp;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private List<Musica> musicas = new ArrayList<>();

    @GetMapping
    public List<Musica> getMusicas() {
        return musicas;
    }

    @GetMapping("/{indice}")
    public Musica buscarPorIndice(@PathVariable int indice) {
        if (indice >= 0 && indice < musicas.size()) {
            return musicas.get(indice);
        }
        return null;
    }

   /* @GetMapping("/cadastrar/{nome}/{artista}")
    public Musica cadastrarMusica(
            @PathVariable String nome,
            @PathVariable String artista) {
        Musica novaMusica = new Musica(nome, artista, LocalDate.now());
        musicas.add(novaMusica);
        return novaMusica;
    }

    @GetMapping("/atualizar/{indice}/{nome}/{artista}")
    public Musica atualizarMusica(
            @PathVariable int indice,
            @PathVariable String nome,
            @PathVariable String artista) {
        if (indice >= 0 && indice < musicas.size()) {
            Musica musica = new Musica(nome, artista, LocalDate.now());
            musicas.set(indice, musica);
            return musica;
        }
        return null;
    }

    @GetMapping("/deletar/{indice}")
    public String deletarMusica(
            @PathVariable int indice) {
            if (indice >= 0 && indice < musicas.size()) {
                musicas.remove(indice);
                return "Musica deletada com sucesso";
            }
            return "Musica não encontrada";
        }*/

    // Outra forma de fazer o Cadastrar
    @PostMapping
    public Musica cadastrarMusicaPut(@RequestBody Musica novaMusica) {
        musicas.add(novaMusica);
        return novaMusica;
    }

    @PutMapping("/{indice}")
    public Musica atualizarMusica(@PathVariable int indice, @RequestBody Musica musica) {
        if (indice >= 0 && indice < musicas.size()) {
            musicas.set(indice, musica);
            return musica;
        }
        return null;
    }

    @DeleteMapping("/{indice}")
    public String deletarMusica(@PathVariable int indice) {
        if (indice >= 0 && indice < musicas.size()) {
            musicas.remove(indice);
            return "Musica deletada com sucesso";
        }
        return "Musica não encontrada";
    }
}
