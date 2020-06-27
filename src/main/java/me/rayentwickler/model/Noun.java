package me.rayentwickler.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Noun")
public class Noun {
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isPlural_flag() {
		return plural_flag;
	}

	public void setPlural_flag(boolean plural_flag) {
		this.plural_flag = plural_flag;
	}

	@Id
	private String id;
	private String word;
	private String level;
	private String meaning;
	private String gender;
	private boolean plural_flag;

}
