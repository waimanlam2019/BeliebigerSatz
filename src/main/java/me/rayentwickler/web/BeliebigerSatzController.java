package me.rayentwickler.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rayentwickler.model.SimpleSentence1;
import me.rayentwickler.service.RandomSentenceService;

@RestController
public class BeliebigerSatzController {
	@Autowired
	private RandomSentenceService randomSentenceService;

	@GetMapping("/sentence")
	public SimpleSentence1 simpleSentence1() {
		System.out.println("Garbage....................");
		return randomSentenceService.getSimpleSentence();
	}
}
