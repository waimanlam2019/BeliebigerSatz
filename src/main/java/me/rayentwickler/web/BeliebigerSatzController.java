package me.rayentwickler.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rayentwickler.model.Sentence;
import me.rayentwickler.service.RandomSentenceService;

@RestController
@CrossOrigin("https://randomgerman.herokuapp.com")

public class BeliebigerSatzController {
	@Autowired
	private RandomSentenceService randomSentenceService;

	@GetMapping("/sentence")
	public Sentence simpleSentence1() {

		Sentence sentence = randomSentenceService.getSentence();
		System.out.println(sentence.toString());

		return sentence;
	}
}
