package org.generation.brazil.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Hello World JSP!");
        return "index";
    }

}
