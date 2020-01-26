package projekti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/indexi")
    public String index(Model model) {
        model.addAttribute("message", "World!");
        return "index";
    }
    
    @GetMapping("*")
    public String cv(Model model) {
        model.addAttribute("message", "World!");
        return "cv";
    }
    
}
