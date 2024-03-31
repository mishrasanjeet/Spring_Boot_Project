package LearnSpringSecurity.SpringSecurityProject.Security;


import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@RestController
public class JWTAuthenticationResource {

    private JwtEncoder jwtEncoder;

    public JWTAuthenticationResource( JwtEncoder jwtEncoder){
        this.jwtEncoder=jwtEncoder;
    }

    @PostMapping("/authenticate")
    public JwtResponse authentication(Authentication authentication){

        return new JwtResponse(CreateToken(authentication));
    }

    private String CreateToken(Authentication authentication) {
        var claims= JwtClaimsSet.builder().issuer("self").issuedAt(Instant.now()).
                expiresAt(Instant.now().plusSeconds(60*15)).subject(authentication.getName())
                .claim("scope",CreateScipe(authentication)).build();

        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();

    }

    private String CreateScipe(Authentication authentication) {

       return  authentication.getAuthorities().stream().map(a->a.getAuthority()).collect(Collectors.joining(" "));
    }


    record  JwtResponse(String token){}
}
