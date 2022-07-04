package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Paese;

@Repository
public interface PaeseDAO extends JpaRepository<Paese, Integer> {

}
