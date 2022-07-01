package com.didaz.todos.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.didaz.todos.entities.Todo;

@Repository
public interface TodoDAO extends JpaRepository<Todo, Integer> {
	
	List<Todo> findByDescrizione(String descrizione);
	List<Todo> findByDescrizioneContaining(String descrizione);
	List<Todo> findByCompletatoFalse();
	
	@Query(value = "select * from todo where data>:giorno",nativeQuery = true)
	List<Todo> trovaPerDataList(@Param("giorno") LocalDate giorno);
	
}
