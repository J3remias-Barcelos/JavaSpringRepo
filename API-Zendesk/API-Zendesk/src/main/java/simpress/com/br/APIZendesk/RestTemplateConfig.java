package simpress.com.br.APIZendesk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private final String zendeskApiToken = "Basic ZWhiZXJ0aUBzaW1wcmVzcy5jb20uYnI6UzFtcHIzfn4="; // Substitua pelo seu token

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + zendeskApiToken);
        return headers;
    }
}

