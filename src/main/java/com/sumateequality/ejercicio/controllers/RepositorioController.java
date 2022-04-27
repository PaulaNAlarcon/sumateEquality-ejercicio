
package com.sumateequality.ejercicio.controllers;

import com.sumateequality.ejercicio.models.Repositorio;
import com.sumateequality.ejercicio.services.RepositorioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paula
 */

@RestController
public class RepositorioController {
    
    @Autowired
    private RepositorioService repositorioService;
    
    @RequestMapping("/getAll")
    public List<Repositorio> getAll(){
        return repositorioService.getAll();
    }
    
    //create, update, delete
    //consultas
}
