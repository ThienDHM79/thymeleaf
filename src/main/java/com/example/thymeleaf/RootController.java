package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {
    @GetMapping
    public String index(Model model){
        model.addAttribute("pageTitle", "Tame2");
        model.addAttribute("scientists", List.of(
                "Einstein",
                "Bohr",
                "Maxwell"
        ));
        return "index";
    }
}
