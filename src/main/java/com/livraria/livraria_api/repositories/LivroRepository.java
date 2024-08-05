package com.livraria.livraria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.livraria.livraria_api.model.Livro;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    //encontrar livros por título
    List<Livro> findByTitulo(String titulo);

    //encontrar livros por titulo que contem um texto
    List<Livro> findByTituloContaining(String titulo);

    //encontrar livros por autor
    List<Livro> findByAutor(String autor);

    //encontrar livros por editora
    List<Livro> findByEditora(String editora);

    //encontrar livros a partir de um ano
    List<Livro> findByAnoPublicacaoGreaterThan(int ano);

    //encontrar livros por um periodo de publicação baseado em anos
    List<Livro> findByAnoPublicacaoBetween(int anoInicio, int anoFinal);
}

