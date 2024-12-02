package br.com.meteora.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public UserDetailsService dadosUsuariosCadastrados() {
        UserDetails usuario1 = User.builder()
        .username("joao@email.com")
        .password("{noop}joao123")
        .build();

        UserDetails usuario2 = User.builder()
        .username("maria@email.com")
        .password("{noop}maria123")
        .build();

        return new InMemoryUserDetailsManager(usuario1, usuario2);
    }
}
