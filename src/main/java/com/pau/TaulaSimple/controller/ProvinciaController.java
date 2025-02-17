package com.pau.TaulaSimple.controller;

import com.pau.TaulaSimple.model.entitats.Provincia;
import com.pau.TaulaSimple.service.TodosProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProvinciaController {
    @Autowired
    TodosProvinciaService provinciaService;

    @GetMapping("/provincies")
    public String obtenirProvincies(Model model) {
        model.addAttribute("provincies", provinciaService.getAllProvincia());
        return "provincies";
    }
}
