package me.rayentwickler.model;

public class SimpleSentence1 {
	private String subject;
	private String verb;
	private String object;

	@Override
	public String toString() {
		return subject + " " + verb + " " + object + ".";
	}

	public SimpleSentence1(String subject, String verb, String object) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

}
