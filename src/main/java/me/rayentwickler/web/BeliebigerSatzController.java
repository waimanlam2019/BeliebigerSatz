package me.rayentwickler.web;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rayentwickler.model.SimpleSentence;
import me.rayentwickler.service.RandomSentenceService;

@RestController
@CrossOrigin("https://randomgerman.herokuapp.com")
public class BeliebigerSatzController {
	@Autowired
	private RandomSentenceService randomSentenceService;

	@GetMapping("/sentence")
	public SimpleSentence simpleSentence1() {

		Random rand = new Random();
		int randInteger = rand.nextInt(2);
		System.out.println(randInteger);

		SimpleSentence sentence = null;
		if (randInteger == 0) {
			sentence = randomSentenceService.getSimpleSentence();
			System.out.println(sentence.toString());
		} else if (randInteger == 1) {
			sentence = randomSentenceService.getSimpleSentenceWithEin();
			System.out.println(sentence.toString());
		}

		return sentence;
	}
}
