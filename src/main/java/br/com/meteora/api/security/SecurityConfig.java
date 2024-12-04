package br.com.meteora.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService dadosUsuariosCadastrados() {
        UserDetails usuario1 = User.builder()
                .username("joao@email.com")
                .password("{noop}joao123")
                .roles("USER")
                .build();

        UserDetails usuario2 = User.builder()
                .username("maria@email.com")
                .password("{noop}maria123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(usuario1, usuario2);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**", "/", "/css/**", "/assets/**", "/contato/**").permitAll()
                .anyRequest().authenticated()
                )

                .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
                .headers(headers -> headers.frameOptions(Customizer.withDefaults()).disable());


        return http.build();
    }

}
