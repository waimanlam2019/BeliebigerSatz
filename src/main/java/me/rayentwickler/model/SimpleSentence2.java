package me.rayentwickler.model;

public class SimpleSentence2 {
	private String subject;
	private String verb;
	private String object;
	private String between;

	@Override
	public String toString() {
		return "SimpleSentence2 [subject=" + subject + ", verb=" + verb + ", object=" + object + ", between=" + between
				+ "]";
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

	public String getBetween() {
		return between;
	}

	public void setBetween(String between) {
		this.between = between;
	}

	public SimpleSentence2() {
		// TODO Auto-generated constructor stub
	}

}
