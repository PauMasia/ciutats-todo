package com.pau.TaulaSimple.error;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    //Podria ser que el model estuviera mal importado
    public String handleException(Exception e, Model model) {
        String missatge = "S'ha produit un error";
//        model.addAttribute("textError", missatge);
        return "error";
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(NoHandlerFoundException e, Model model) {
        String missatge = "La ruta sol·licitada no existeix";
        model.addAttribute("textError", missatge);
        return "error";  // O puedes retornar una vista 404 personalizada si prefieres
    }
}
