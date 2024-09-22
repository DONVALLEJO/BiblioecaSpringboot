package com.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.app.entity.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Integer> {

}
