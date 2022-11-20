package bbs1120.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping("/hi/{id}")
    public String hello(@PathVariable String id, Model model) {
        model.addAttribute("username", "jimandy");
        model.addAttribute("id", id);
        return "greetings";
    }
}
