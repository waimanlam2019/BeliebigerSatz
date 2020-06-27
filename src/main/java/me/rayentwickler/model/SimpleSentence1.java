package me.rayentwickler.model;

public class SimpleSentence1 {
	private Noun subject;
	private Verb verb;
	private Noun object;

	@Override
	public String toString() {
		return subject + " " + verb + " " + object + ".";
	}

	public SimpleSentence1(Noun subject, Verb verb, Noun object) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
	}

	public Noun getSubject() {
		return subject;
	}

	public void setSubject(Noun subject) {
		this.subject = subject;
	}

	public Verb getVerb() {
		return verb;
	}

	public void setVerb(Verb verb) {
		this.verb = verb;
	}

	public Noun getObject() {
		return object;
	}

	public void setObject(Noun object) {
		this.object = object;
	}

	public SimpleSentence1() {
		// TODO Auto-generated constructor stub
	}

}
