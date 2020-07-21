package me.rayentwickler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.rayentwickler.data.NounRepository;
import me.rayentwickler.data.VerbRepository;
import me.rayentwickler.model.Noun;
import me.rayentwickler.model.SimpleSentence;
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
	public SimpleSentence getSimpleSentence() {
		Noun subject = nounRepository.findRandomNoun();
		Noun object = nounRepository.findRandomNoun();
		Verb verb = verbRepository.findRandomVerb();
		if (subject.isPlural_flag()) {// Plural - Sie
			return new SimpleSentence(String.join(" ", subject.getGender(), subject.getWord()), verb.getPräsens_Sie(),
					verb.getDefault_preposition(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		} else {// Single - Er Sie Es
			return new SimpleSentence(String.join(" ", subject.getGender(), subject.getWord()),
					verb.getPräsens_er_sie_es(), verb.getDefault_preposition(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		}

	}

	@Override
	public SimpleSentence getSimpleSentenceWithEin() {
		Noun subject = nounRepository.findRandomNoun();
		Noun object = nounRepository.findRandomNoun();
		Verb verb = verbRepository.findRandomVerb();
		if (subject.isPlural_flag()) {// Plural - Sie
			return new SimpleSentence(String.join(" ", subject.getGender(), subject.getWord()), verb.getPräsens_Sie(),
					verb.getDefault_preposition(),
					String.join(" ", ArticleLogic.accusativeDefiniteArticle(object.getGender()), object.getWord()));
		} else {// Single - Er Sie Es
			return new SimpleSentence(String.join(" ", subject.getGender(), subject.getWord()),
					verb.getPräsens_er_sie_es(), verb.getDefault_preposition(),
					String.join(" ", ArticleLogic.accusativeIndefiniteArticle(object.getGender()), object.getWord()));
		}
	}

}
