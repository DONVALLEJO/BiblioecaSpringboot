package com.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.app.entity.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Integer> {

}
