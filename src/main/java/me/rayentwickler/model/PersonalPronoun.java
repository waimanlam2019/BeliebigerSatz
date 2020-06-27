package me.rayentwickler.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonalPronoun")
public class PersonalPronoun {
	@Id
	private String id;
	private String case_fall;
	private String personal_pronoun;
	private String derived_form;

	public String getCase_fall() {
		return case_fall;
	}

	public void setCase_fall(String case_fall) {
		this.case_fall = case_fall;
	}

	public String getPersonal_pronoun() {
		return personal_pronoun;
	}

	public void setPersonal_pronoun(String personal_pronoun) {
		this.personal_pronoun = personal_pronoun;
	}

	public String getDerived_form() {
		return derived_form;
	}

	public void setDerived_form(String derived_form) {
		this.derived_form = derived_form;
	}
}
