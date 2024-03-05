package simpress.com.br.APIZendesk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZendeskApiApplication implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Value("${zendesk.api.url}")
    private String zendeskApiUrl;

    private final RestTemplateConfig restTemplateConfig;

    public ZendeskApiApplication(RestTemplate restTemplate, RestTemplateConfig restTemplateConfig) {
        this.restTemplate = restTemplate;
        this.restTemplateConfig = restTemplateConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZendeskApiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Substitua os endpoints e parâmetros conforme necessário
        String[] endpoints = {
                "/tickets.json?status=open",
                "/tickets.json?status=closed",
                "/users.json?role=agent",
                "/users.json?role=end-user",
                "/organizations.json",
                "/groups.json",
                "/ticket_fields.json",
                "/ticket_forms.json",
                "/ticket_metrics.json",
                "/ticket_audits.json",
                "/ticket_events.json",
                "/ticket_comments.json",
                "/ticket_satisfaction_ratings.json",
                "/ticket_imports.json",
                "/ticket_exports.json",
                "/ticket_views.json",
                "tickets.json?priority=normal"
                // Adicione mais endpoints conforme necessário
        };

        HttpHeaders headers = restTemplateConfig.getHeaders(); // Obtenha os headers aqui

        for (String endpoint : endpoints) {
            String url = zendeskApiUrl + endpoint;

            ResponseEntity<String> response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    null, // Adapte aqui para null, pois agora os headers estão no terceiro parâmetro
                    String.class
            );

            System.out.println("Response for " + url + ":");
            System.out.println(response.getBody());
            System.out.println("=====================================");
        }
    }
}