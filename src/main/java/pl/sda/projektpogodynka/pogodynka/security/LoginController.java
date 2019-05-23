package pl.sda.projektpogodynka.pogodynka.security;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    public static final String LOGIN_PATH = "api/login";

    @GetMapping(LoginController.LOGIN_PATH)
    public String userLoginView() {
        return "login";
    }
}
