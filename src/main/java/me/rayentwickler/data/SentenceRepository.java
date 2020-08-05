package me.rayentwickler.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.rayentwickler.model.Sentence;

@Repository
public interface SentenceRepository extends CrudRepository<Sentence, Long> {
	@Query(value = "SELECT * FROM Sentence WHERE id IN (SELECT id FROM Sentence ORDER BY RANDOM() LIMIT 1) ", nativeQuery = true)
	Sentence findRandomSentence();
}
