package me.rayentwickler.model;

public class SimpleSentence1 {
	private Noun subject;
	private Verb verb;
	private Noun object;

	@Override
	public String toString() {
		return subject + " " + verb + " " + object + ".";
	}

	public SimpleSentence1() {
		// TODO Auto-generated constructor stub
	}

}
