package me.rayentwickler.data;

import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.Noun;

public interface NounRepository extends CrudRepository<Noun, Long> {

}
