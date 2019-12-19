package br.edu.ifal.qualquer_lugar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/menu")
    public ModelAndView menu(){
        return new ModelAndView("menu.html");
    }

    @RequestMapping("/carrinho")
    public ModelAndView carrinho(){
        return new ModelAndView("carrinho.html");
    }
}