package me.rayentwickler.data;

import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.Verb;

public interface VerbRepository extends CrudRepository<Verb, Long> {

}
