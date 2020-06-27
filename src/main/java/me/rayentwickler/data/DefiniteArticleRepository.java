package me.rayentwickler.data;

import org.springframework.data.repository.CrudRepository;

import me.rayentwickler.model.DefiniteArticle;

public interface DefiniteArticleRepository extends CrudRepository<DefiniteArticle, Long> {

}
