package introspring;

public class Language {
private String lang;
private int rating;
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public int getRating() {
	return rating;
}


public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Language [lang=" + lang + ", rating=" + rating + "]";
}

}

