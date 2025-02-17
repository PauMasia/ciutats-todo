//package com.pau.TaulaSimple.controller;
//
//
//import com.pau.TaulaSimple.model.entitats.Ciutat;
//import com.pau.TaulaSimple.model.entitats.Franquicia;
//import com.pau.TaulaSimple.model.entitats.Provincia;
//import com.pau.TaulaSimple.service.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class TodosController {
//    @Autowired
//    private TodosPaisService paisService;
//    @Autowired
//    private TodosProvinciaService provinciaService;
//    @Autowired
//    private TodosCiutatService ciutatService;
//    @Autowired
//    private TodosFranquiciaService franquiciaService;
//
//    // Mostra tots els països en una pàgina HTML
//    @GetMapping("/paisos")
//    public String veurePaisos(Model model) {
//        model.addAttribute("paisos", paisService.getAllPaises()); // Afegeix la llista de països al model
//        return "paisos"; // Retorna la plantilla "paisos.html"
//    }
//
//    @GetMapping("/provincies")
//    public String veureProvincies(Model model) {
//        model.addAttribute("provincies", provinciaService.getAllProvincia()); // Afegeix la llista de països al model
//        return "provincies"; // Retorna la plantilla "provincies.html"
//    }
//
//    @GetMapping("/ciutats")
//    public String veureCiutats(Model model) {
//        model.addAttribute("ciutats", ciutatService.getAllCiutats()); // Afegeix la llista de països al model
//        return "ciutats"; // Retorna la plantilla "ciutats.html"
//    }
//    //¿?
//    @GetMapping("/franquicies")
//    public String veureFranquicies(Model model) {
//        model.addAttribute("franquicies", franquiciaService.getAllFranquicias()); // Afegeix la llista de països al model
//        return "franquicies"; // Retorna la plantilla "franquicia.html"
//    }
//}
