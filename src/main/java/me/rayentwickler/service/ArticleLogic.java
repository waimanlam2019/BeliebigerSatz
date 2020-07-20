package me.rayentwickler.service;

public class ArticleLogic {
	public static String accusativeDefiniteArticle(String gender) {
		String output = null;
		switch (gender) {
		case "das":
			output = "das";
			break;
		case "der":
			output = "den";
			break;
		case "die":
			output = "die";
			break;
		default:
			output = "";
		}
		return output;
	}

	public static String accusativeIndefiniteArticle(String gender) {
		String output = null;
		switch (gender) {
		case "das":
			output = "ein";
			break;
		case "der":
			output = "einen";
			break;
		case "die":
			output = "eine";
			break;
		default:
			output = "";
		}
		return output;
	}

}
