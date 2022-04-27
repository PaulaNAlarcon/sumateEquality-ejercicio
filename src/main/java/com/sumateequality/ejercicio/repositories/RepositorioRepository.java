
package com.sumateequality.ejercicio.repositories;

import com.sumateequality.ejercicio.models.Repositorio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Paula
 */

@Repository
public interface RepositorioRepository extends MongoRepository<Repositorio, String>{
    //consultas
}
