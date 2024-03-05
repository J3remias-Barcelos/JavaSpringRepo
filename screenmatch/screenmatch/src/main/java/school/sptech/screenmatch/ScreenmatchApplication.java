package school.sptech.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import school.sptech.screenmatch.modal.DadosSerie;
import school.sptech.screenmatch.service.ConsumoApi;
import school.sptech.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		// Esse Run será pareceido com o Main que estamos acostumados a ver
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=3493674b");

		System.out.println(json);
		/*json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.printf("Coffee: %s\n", json);*/

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dados);
	}
}
