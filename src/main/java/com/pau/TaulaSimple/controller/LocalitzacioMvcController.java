package com.pau.TaulaSimple.controller;

import com.pau.TaulaSimple.model.entitats.Ciutat;
import com.pau.TaulaSimple.model.entitats.Franquicia;
import com.pau.TaulaSimple.model.entitats.Provincia;
import com.pau.TaulaSimple.service.CiutatPoblacioMinimaService;
import com.pau.TaulaSimple.service.TodosFranquiciaService;
import com.pau.TaulaSimple.service.TodosPaisService;
import com.pau.TaulaSimple.service.ProvinciaObtenerPorPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/localitzacions") // URL base per a totes les peticions
public class LocalitzacioMvcController {


    @Autowired
    private ProvinciaObtenerPorPaisService provinciaService;

    @Autowired
    private CiutatPoblacioMinimaService ciutatService;

    // Mostra les províncies d'un país concret en una pàgina HTML
    @GetMapping("/provincies-pais")
    public String veureProvincies(@RequestParam String nomPais, Model model) {
        List<Provincia> provincies = provinciaService.obtenerProvinciasPorPais(nomPais);
        model.addAttribute("provincies", provincies); // Afegeix la llista de províncies al model
        model.addAttribute("pais", nomPais); // Afegeix el nom del país seleccionat al model
        return "provincies"; // Retorna la plantilla "provincies.html"
    }

    // Mostra les ciutats amb més de X habitants en una pàgina HTML
    @GetMapping("/ciutats-poblacio")
    public String veureCiutats(@RequestParam int poblacioMinima, Model model) {
        List<Ciutat> ciutats = ciutatService.obtenirCiutatsAmbPoblacioMinima(poblacioMinima);
        model.addAttribute("ciutats", ciutats); // Afegeix la llista de ciutats al model
        model.addAttribute("poblacioMinima", poblacioMinima); // Afegeix el valor de població mínima al model
        return "ciutats"; // Retorna la plantilla "ciutats.html"
    }
}
