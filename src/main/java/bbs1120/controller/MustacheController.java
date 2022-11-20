package bbs1120.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MustacheController {

    @GetMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("username", "jimandy");
        return "greetings";
    }
}
