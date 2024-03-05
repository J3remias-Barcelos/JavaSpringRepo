package school.sptech.respostajsonaula01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    // singleton
    private int contador;

    @GetMapping("/somar/{a}/{b}")
    public Integer somar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/contador")
    public int contador() {
        return ++contador;
    }

    @GetMapping("/contador2")
    public int contador2() {
        return ++contador;
    }

}
