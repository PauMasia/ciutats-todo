package com.pau.TaulaSimple.controller;

import com.pau.TaulaSimple.model.entitats.Franquicia;
import com.pau.TaulaSimple.service.TodosFranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FranquiciaController {
    @Autowired
        TodosFranquiciaService franquiciaService;

    @GetMapping("/franquicia")
    public String obtenirFranquicies(Model model) {
        model.addAttribute("franquicies", franquiciaService.getAllFranquicias());
        return "franquicies";
    }
}
