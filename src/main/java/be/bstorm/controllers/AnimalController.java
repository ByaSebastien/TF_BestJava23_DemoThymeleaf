package be.bstorm.controllers;

import be.bstorm.models.entities.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @GetMapping
    public String home(Model model){
        Animal a = new Animal();
        a.setId(1L);
        a.setName("Zara");

        //model sert a transferer des donnée entre le controller et la page html
        model.addAttribute("toto",a);
        model.addAttribute("age",15);
        model.addAttribute("plat","Burger");

        return "animal/home.html";
    }

    @GetMapping("/about")
    public String about(){

        return "animal/about";
    }
}
