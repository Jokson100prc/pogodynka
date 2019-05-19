package pl.sda.projektpogodynka.pogodynka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.projektpogodynka.pogodynka.repository.UserRepository;

@Controller
@RequestMapping("view/pogodynka/users")
public class UserViewController {

    private UserRepository userRepository;

    public UserViewController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String allUserView(Model indexViewModel){
        indexViewModel.addAttribute("allUsers", userRepository.findAll());

        return "index";
    }
}
