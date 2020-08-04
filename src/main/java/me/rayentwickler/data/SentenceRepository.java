package me.rayentwickler.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.Sentence;

public interface SentenceRepository extends CrudRepository<Sentence, Long> {
	@Query(value = "SELECT * FROM Sentence WHERE id IN (SELECT id FROM Sentence ORDER BY RANDOM() LIMIT 1) ", nativeQuery = true)
	Sentence findRandomSentence();
}
