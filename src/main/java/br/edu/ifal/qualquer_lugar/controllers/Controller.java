package br.edu.ifal.qualquer_lugar.controllers;

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

    @RequestMapping("/cadastrar")
    public ModelAndView carrinho(){
        return new ModelAndView("cadastrar.html");
    }

    @RequestMapping("/favoritos")
    public ModelAndView favoritos(){
        return new ModelAndView("favoritos.html");
    }
}