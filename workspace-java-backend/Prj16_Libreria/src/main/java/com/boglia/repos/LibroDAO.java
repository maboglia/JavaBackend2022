package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entitties.Libro;

@Repository
public interface LibroDAO extends JpaRepository<Libro, Integer>{

}
