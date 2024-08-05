package com.livraria.livraria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.livraria.livraria_api.model.Editora;
import java.util.List;


public interface EditoraRepository extends JpaRepository <Editora, Long>{

    //achar editora por nome
    List<Editora> findByNome(String nome);
    
}
