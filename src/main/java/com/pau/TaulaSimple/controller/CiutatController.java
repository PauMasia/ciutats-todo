package com.pau.TaulaSimple.controller;

import com.pau.TaulaSimple.model.entitats.Ciutat;
import com.pau.TaulaSimple.model.repositoris.CiutatRepository;
import com.pau.TaulaSimple.service.TodosCiutatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller

public class CiutatController {
    @Autowired
    TodosCiutatService ciutatService;

    @GetMapping("/ciutats")
    public String obtenirCiutats(Model model) {

        model.addAttribute("ciutats",ciutatService.getAllCiutats());
        return "ciutats";
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Ciutat> obtenirCiutatPerId(@PathVariable(value = "id") Long id) {
//        Optional<Ciutat> ciutat = ciutatService.findById(id);
//
//        if (ciutat.isPresent()) {
//            return ResponseEntity.ok().body(ciutat.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping
//    public Ciutat crearCiutat(@RequestBody Ciutat ciutat) {
//        return ciutatRepository.save(ciutat);
//    }
//
//    @DeleteMapping("/{id}")
//    public void eliminarCiutat(@PathVariable Long id) {
//        ciutatRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Ciutat> actualitzarCiutat(@PathVariable Long id, @RequestBody Ciutat ciutatActualitzada) {
//        Optional<Ciutat> optionalCiutat = ciutatRepository.findById(id);
//        if (optionalCiutat.isPresent()) {
//            Ciutat ciutat = optionalCiutat.get();
//
//            ciutat.setNom(ciutatActualitzada.getNom());
//            ciutat.setPoblacio(ciutatActualitzada.getPoblacio());
//            ciutat.setDescripcio(ciutatActualitzada.getDescripcio());
//            ciutat.setImatge(ciutatActualitzada.getImatge());
//            return ResponseEntity.ok().body(ciutatRepository.save(ciutat));
//        }else {
//            return ResponseEntity.notFound().build();
//
//        }
//    }

}
