import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;



@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User("", ""));
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        // Логика для сохранения пользователя
        return "redirect:/";
    }
}
