package me.rayentwickler.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rayentwickler.model.Sentence;
import me.rayentwickler.service.RandomSentenceService;

@RestController
@CrossOrigin("https://randomgerman.herokuapp.com")
public class BeliebigerSatzController {
	private Logger logger = LoggerFactory.getLogger(BeliebigerSatzController.class);
	@Autowired
	private RandomSentenceService randomSentenceService;

	@GetMapping("/sentence")
	public Sentence simpleSentence() {
		Sentence sentence = randomSentenceService.getSentence();
		logger.info("Sentence is :{}", sentence.toString());

		return sentence;
	}
}
