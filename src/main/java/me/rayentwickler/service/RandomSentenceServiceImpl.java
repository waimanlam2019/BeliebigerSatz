package me.rayentwickler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.rayentwickler.data.NounRepository;
import me.rayentwickler.data.VerbRepository;
import me.rayentwickler.model.Noun;
import me.rayentwickler.model.SimpleSentence1;
import me.rayentwickler.model.Verb;

@Service
public class RandomSentenceServiceImpl implements RandomSentenceService {
	@Autowired
	private NounRepository nounRepository;
	@Autowired
	private VerbRepository verbRepository;

	public RandomSentenceServiceImpl() {
	}

	@Override
	public SimpleSentence1 getSimpleSentence() {
		Noun subject = nounRepository.findRandomNoun();
		Noun object = nounRepository.findRandomNoun();
		Verb verb = verbRepository.findRandomVerb();
		if (subject.isPlural_flag()) {// Plural - Sie
			return new SimpleSentence1(String.join(" ", subject.getGender(), subject.getWord()), verb.getPräsens_Sie(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		} else {// Single - Er Sie Es
			return new SimpleSentence1(String.join(" ", subject.getGender(), subject.getWord()),
					verb.getPräsens_er_sie_es(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		}

	}

	@Override
	public SimpleSentence1 getSimpleSentenceWithEin() {
		Noun subject = nounRepository.findRandomNoun();
		Noun object = nounRepository.findRandomNoun();
		Verb verb = verbRepository.findRandomVerb();
		if (subject.isPlural_flag()) {// Plural - Sie
			return new SimpleSentence1(String.join(" ", subject.getGender(), subject.getWord()), verb.getPräsens_Sie(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		} else {// Single - Er Sie Es
			return new SimpleSentence1(String.join(" ", subject.getGender(), subject.getWord()),
					verb.getPräsens_er_sie_es(),
					String.join(" ", ArticleLogic.accusativeIndefiniteArticle(object.getGender()), object.getWord()));
		}
	}

}
