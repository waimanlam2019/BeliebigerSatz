package me.rayentwickler.data;

import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.PersonalPronoun;

public interface PersonalPronounRepository extends CrudRepository<PersonalPronoun, Long> {

}
