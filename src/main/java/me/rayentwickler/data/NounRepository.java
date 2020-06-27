package me.rayentwickler.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.Noun;

public interface NounRepository extends CrudRepository<Noun, Long> {

	@Query(value = "SELECT * FROM Noun WHERE id IN (SELECT id FROM Noun ORDER BY RANDOM() LIMIT 1) ", nativeQuery = true)
	Noun findRandomNoun();
}
