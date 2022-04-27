
package com.sumateequality.ejercicio.services;

import com.sumateequality.ejercicio.models.Repositorio;
import com.sumateequality.ejercicio.repositories.RepositorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Paula
 */

@Service
public class RepositorioService {

    @Autowired
    private RepositorioRepository repositorioRepository;

    public List<Repositorio> getAll(){
        return repositorioRepository.findAll();
    }
    
    //Método create, update, delete
    //Consultas
    
    
}
