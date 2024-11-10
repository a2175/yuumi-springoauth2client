package hello.springoauth2client.oauth2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.oauth2.client.JdbcOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@Configuration
@RequiredArgsConstructor
public class CustomOAuth2AuthorizedClientService {

    private final JdbcTemplate jdbcTemplate;
    private final CustomClientRegistrationRepo customClientRegistrationRepo;

    public OAuth2AuthorizedClientService oAuth2AuthorizedClientService() {

        return new JdbcOAuth2AuthorizedClientService(jdbcTemplate, customClientRegistrationRepo.clientRegistrationRepository());
    }
}
