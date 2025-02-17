package com.pau.TaulaSimple.controller;

import com.pau.TaulaSimple.model.entitats.Pais;
import com.pau.TaulaSimple.service.TodosPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaisController {
    @Autowired
    TodosPaisService paisService;

    @GetMapping("/paisos")
    public String obtenirPaisos(Model model) {
        model.addAttribute("paisos", paisService.getAllPaises());
        return "paisos";
    }
}
