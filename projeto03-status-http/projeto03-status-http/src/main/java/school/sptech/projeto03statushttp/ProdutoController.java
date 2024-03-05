package school.sptech.projeto03statushttp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        if (produtos.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(produtos);
    }

    @GetMapping("/{indice}")
    public Produto buscarPorIndice(@PathVariable int indice) {
        return produtos.get(indice);
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
        /*if (produto.getNome().length() < 8) {
            return ResponseEntity.status(400).build();
        }*/

        produtos.add(produto);
        return ResponseEntity.status(201).body(produto);
    }

    @PutMapping("/{indice}")
    public ResponseEntity<Produto> atualizar(@PathVariable int indice, @RequestBody Produto produto) {
        if (exiteProduto(indice)) {
            produtos.set(indice, produto);
            return ResponseEntity.status(200).body(produtos.get(indice));
        }
        return ResponseEntity.status(404).build();
    }

    // Tenha a chamada GET /produtos/estoque/{qtdEstoque} que busca todos os produtos com a quantidade de estoque maior ou igual a qtdEstoque. Exemplo:
    // GET /produtos/estoque/10
    @GetMapping("/estoque/{qtdEstoque}")
    public ResponseEntity<List<Produto>> buscarPorEstoque(@RequestBody int qtdEstoque) {
        List<Produto> produtosComEstoque = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getQtdEstoque() >= qtdEstoque) {
                produtosComEstoque.add(produto);
            }
        }

        if (produtosComEstoque.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(produtosComEstoque);
    }

    @DeleteMapping("/{indice}")
    public ResponseEntity<Void> excluir(@PathVariable int indice) {
        if (exiteProduto(indice)) {
            produtos.remove(indice);
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/busca-por-nome")
    public ResponseEntity<List<Produto>> buscarPorNome(@RequestParam String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().contains(nome)) {
                produtosEncontrados.add(produtoDaVez);
            }
        }

        if (produtosEncontrados.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(produtosEncontrados);
    }

    public boolean exiteProduto(int indice) {
        return indice >= 0 && indice < produtos.size();
    }
}
