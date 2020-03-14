package lv.accenture.bootcamp.apiService;

public class SearchResult {

	private String title;
	
	private int year;
	
	private String imdbID;
	
	private String type;
	
	private String poster;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	@Override
	public String toString() {
		return "SearchResult [title=" + title + ", year=" + year + ", imdbID=" + imdbID + ", type=" + type + ", poster="
				+ poster + "]";
	}
	
	
	
}
