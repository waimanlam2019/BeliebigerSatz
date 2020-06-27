package me.rayentwickler.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.Verb;

public interface VerbRepository extends CrudRepository<Verb, Long> {

	@Query(value = "SELECT * FROM Verb WHERE id IN (SELECT id FROM Verb ORDER BY RANDOM() LIMIT 1) ", nativeQuery = true)
	Verb findRandomVerb();
}
