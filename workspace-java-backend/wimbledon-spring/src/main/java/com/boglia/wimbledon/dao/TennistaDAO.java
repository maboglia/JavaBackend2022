package com.boglia.wimbledon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.wimbledon.model.Tennista;

public interface TennistaDAO extends JpaRepository<Tennista, Integer> {

}
