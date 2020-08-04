package me.rayentwickler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.rayentwickler.data.SentenceRepository;
import me.rayentwickler.model.Sentence;

@Service
public class RandomSentenceServiceImpl implements RandomSentenceService {
	@Autowired
	private SentenceRepository sentenceRepository;

	public RandomSentenceServiceImpl() {
	}

	@Override
	public Sentence getSentence() {
		Sentence sentence = sentenceRepository.findRandomSentence();
		return sentence;

	}

}
