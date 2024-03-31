package LearnSpringSecurity.SpringSecurityProject.Security;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityCSRF {

    @GetMapping("/csrf_token")
    public CsrfToken reriveCSRFToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");
    }
}
