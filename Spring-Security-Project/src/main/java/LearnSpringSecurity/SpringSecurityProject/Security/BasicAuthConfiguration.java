package LearnSpringSecurity.SpringSecurityProject.Security;

import jakarta.persistence.Embedded;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAKey;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.*;

public class BasicAuthConfiguration {

    @Bean
    @Order(2147483642)
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth-> {auth.anyRequest().authenticated();});

        http.sessionManagement(
                session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                );
        http.csrf(AbstractHttpConfigurer::disable);
        http.cors(AbstractHttpConfigurer::disable);

        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
    @Bean
   public UserDetailsService userDetailsService(){

    var user=User.withUsername("user").password("{noop}test123").build();

    var admin=User.withUsername("admin").password("{noop}test").build();


    return new InMemoryUserDetailsManager(user,admin);
}


}

