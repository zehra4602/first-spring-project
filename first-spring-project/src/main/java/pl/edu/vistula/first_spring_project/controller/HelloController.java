package pl.edu.vistula.first_spring_project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Vistula Student");
        return "greeting";
    }
}
