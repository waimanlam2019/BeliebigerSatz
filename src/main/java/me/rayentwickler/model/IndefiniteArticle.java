package me.rayentwickler.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IndefiniteArticle")
public class IndefiniteArticle {
	@Id
	private String id;
	private String case_fall;
	private String gender;
	private String form;

	public String getCase_fall() {
		return case_fall;
	}

	public void setCase_fall(String case_fall) {
		this.case_fall = case_fall;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}
}
