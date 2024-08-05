package com.livraria.livraria_api.repositories;

import java.util.List;
import com.livraria.livraria_api.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long>{

    //achar autor por nome
    List<Autor> findByNome(String nome);
    
}
