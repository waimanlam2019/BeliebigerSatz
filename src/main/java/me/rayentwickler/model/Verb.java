package me.rayentwickler.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Verb")
public class Verb {
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

	public boolean isTransitive_flag() {
		return transitive_flag;
	}

	public void setTransitive_flag(boolean transitive_flag) {
		this.transitive_flag = transitive_flag;
	}

	public String getPräsens_ich() {
		return präsens_ich;
	}

	public void setPräsens_ich(String präsens_ich) {
		this.präsens_ich = präsens_ich;
	}

	public String getPräsens_du() {
		return präsens_du;
	}

	public void setPräsens_du(String präsens_du) {
		this.präsens_du = präsens_du;
	}

	public String getPräsens_er_sie_es() {
		return präsens_er_sie_es;
	}

	public void setPräsens_er_sie_es(String präsens_er_sie_es) {
		this.präsens_er_sie_es = präsens_er_sie_es;
	}

	public String getPräsens_wir() {
		return präsens_wir;
	}

	public void setPräsens_wir(String präsens_wir) {
		this.präsens_wir = präsens_wir;
	}

	public String getPräsens_ihr() {
		return präsens_ihr;
	}

	public void setPräsens_ihr(String präsens_ihr) {
		this.präsens_ihr = präsens_ihr;
	}

	public String getPräsens_Sie() {
		return präsens_Sie;
	}

	public void setPräsens_Sie(String präsens_Sie) {
		this.präsens_Sie = präsens_Sie;
	}

	public String getPräteritum_ich() {
		return präteritum_ich;
	}

	public void setPräteritum_ich(String präteritum_ich) {
		this.präteritum_ich = präteritum_ich;
	}

	public String getPräteritum_du() {
		return präteritum_du;
	}

	public void setPräteritum_du(String präteritum_du) {
		this.präteritum_du = präteritum_du;
	}

	public String getPräteritum_er_sie_es() {
		return präteritum_er_sie_es;
	}

	public void setPräteritum_er_sie_es(String präteritum_er_sie_es) {
		this.präteritum_er_sie_es = präteritum_er_sie_es;
	}

	public String getPräteritum_wir() {
		return präteritum_wir;
	}

	public void setPräteritum_wir(String präteritum_wir) {
		this.präteritum_wir = präteritum_wir;
	}

	public String getPräteritum_ihr() {
		return präteritum_ihr;
	}

	public void setPräteritum_ihr(String präteritum_ihr) {
		this.präteritum_ihr = präteritum_ihr;
	}

	public String getPräteritum_Sie() {
		return präteritum_Sie;
	}

	public void setPräteritum_Sie(String präteritum_Sie) {
		this.präteritum_Sie = präteritum_Sie;
	}

	public String getPerfekt_ich() {
		return perfekt_ich;
	}

	public void setPerfekt_ich(String perfekt_ich) {
		this.perfekt_ich = perfekt_ich;
	}

	public String getPerfekt_du() {
		return perfekt_du;
	}

	public void setPerfekt_du(String perfekt_du) {
		this.perfekt_du = perfekt_du;
	}

	public String getPerfekt_er_sie_es() {
		return perfekt_er_sie_es;
	}

	public void setPerfekt_er_sie_es(String perfekt_er_sie_es) {
		this.perfekt_er_sie_es = perfekt_er_sie_es;
	}

	public String getPerfekt_wir() {
		return perfekt_wir;
	}

	public void setPerfekt_wir(String perfekt_wir) {
		this.perfekt_wir = perfekt_wir;
	}

	public String getPerfekt_ihr() {
		return perfekt_ihr;
	}

	public void setPerfekt_ihr(String perfekt_ihr) {
		this.perfekt_ihr = perfekt_ihr;
	}

	public String getPerfekt_Sie() {
		return perfekt_Sie;
	}

	public void setPerfekt_Sie(String perfekt_Sie) {
		this.perfekt_Sie = perfekt_Sie;
	}

	public String getFutur_I_ich() {
		return futur_I_ich;
	}

	public void setFutur_I_ich(String futur_I_ich) {
		this.futur_I_ich = futur_I_ich;
	}

	public String getFutur_I_du() {
		return futur_I_du;
	}

	public void setFutur_I_du(String futur_I_du) {
		this.futur_I_du = futur_I_du;
	}

	public String getFutur_I_er_sie_es() {
		return futur_I_er_sie_es;
	}

	public void setFutur_I_er_sie_es(String futur_I_er_sie_es) {
		this.futur_I_er_sie_es = futur_I_er_sie_es;
	}

	public String getFutur_I_wir() {
		return futur_I_wir;
	}

	public void setFutur_I_wir(String futur_I_wir) {
		this.futur_I_wir = futur_I_wir;
	}

	public String getFutur_I_ihr() {
		return futur_I_ihr;
	}

	public void setFutur_I_ihr(String futur_I_ihr) {
		this.futur_I_ihr = futur_I_ihr;
	}

	public String getFutur_I_Sie() {
		return futur_I_Sie;
	}

	public void setFutur_I_Sie(String futur_I_Sie) {
		this.futur_I_Sie = futur_I_Sie;
	}

	public String getPlusquamperfekt_ich() {
		return plusquamperfekt_ich;
	}

	public void setPlusquamperfekt_ich(String plusquamperfekt_ich) {
		this.plusquamperfekt_ich = plusquamperfekt_ich;
	}

	public String getPlusquamperfekt_du() {
		return plusquamperfekt_du;
	}

	public void setPlusquamperfekt_du(String plusquamperfekt_du) {
		this.plusquamperfekt_du = plusquamperfekt_du;
	}

	public String getPlusquamperfekt_er_sie_es() {
		return plusquamperfekt_er_sie_es;
	}

	public void setPlusquamperfekt_er_sie_es(String plusquamperfekt_er_sie_es) {
		this.plusquamperfekt_er_sie_es = plusquamperfekt_er_sie_es;
	}

	public String getPlusquamperfekt_wir() {
		return plusquamperfekt_wir;
	}

	public void setPlusquamperfekt_wir(String plusquamperfekt_wir) {
		this.plusquamperfekt_wir = plusquamperfekt_wir;
	}

	public String getPlusquamperfekt_ihr() {
		return plusquamperfekt_ihr;
	}

	public void setPlusquamperfekt_ihr(String plusquamperfekt_ihr) {
		this.plusquamperfekt_ihr = plusquamperfekt_ihr;
	}

	public String getPlusquamperfekt_Sie() {
		return plusquamperfekt_Sie;
	}

	public void setPlusquamperfekt_Sie(String plusquamperfekt_Sie) {
		this.plusquamperfekt_Sie = plusquamperfekt_Sie;
	}

	public String getFutur_II_ich() {
		return futur_II_ich;
	}

	public void setFutur_II_ich(String futur_II_ich) {
		this.futur_II_ich = futur_II_ich;
	}

	public String getFutur_II_du() {
		return futur_II_du;
	}

	public void setFutur_II_du(String futur_II_du) {
		this.futur_II_du = futur_II_du;
	}

	public String getFutur_II_er_sie_es() {
		return futur_II_er_sie_es;
	}

	public void setFutur_II_er_sie_es(String futur_II_er_sie_es) {
		this.futur_II_er_sie_es = futur_II_er_sie_es;
	}

	public String getFutur_II_wir() {
		return futur_II_wir;
	}

	public void setFutur_II_wir(String futur_II_wir) {
		this.futur_II_wir = futur_II_wir;
	}

	public String getFutur_II_ihr() {
		return futur_II_ihr;
	}

	public void setFutur_II_ihr(String futur_II_ihr) {
		this.futur_II_ihr = futur_II_ihr;
	}

	public String getFutur_II_Sie() {
		return futur_II_Sie;
	}

	public void setFutur_II_Sie(String futur_II_Sie) {
		this.futur_II_Sie = futur_II_Sie;
	}

	@Id
	private String id;
	private String word;
	private String level;
	private boolean transitive_flag;
	private String präsens_ich;
	private String präsens_du;
	private String präsens_er_sie_es;
	private String präsens_wir;
	private String präsens_ihr;
	private String präsens_Sie;
	private String präteritum_ich;
	private String präteritum_du;
	private String präteritum_er_sie_es;
	private String präteritum_wir;
	private String präteritum_ihr;
	private String präteritum_Sie;
	private String perfekt_ich;
	private String perfekt_du;
	private String perfekt_er_sie_es;
	private String perfekt_wir;
	private String perfekt_ihr;
	private String perfekt_Sie;
	private String futur_I_ich;
	private String futur_I_du;
	private String futur_I_er_sie_es;
	private String futur_I_wir;
	private String futur_I_ihr;
	private String futur_I_Sie;
	private String plusquamperfekt_ich;
	private String plusquamperfekt_du;
	private String plusquamperfekt_er_sie_es;
	private String plusquamperfekt_wir;
	private String plusquamperfekt_ihr;
	private String plusquamperfekt_Sie;
	private String futur_II_ich;
	private String futur_II_du;
	private String futur_II_er_sie_es;
	private String futur_II_wir;
	private String futur_II_ihr;
	private String futur_II_Sie;

}
