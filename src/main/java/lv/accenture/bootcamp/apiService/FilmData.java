package lv.accenture.bootcamp.apiService;

public class FilmData {
    private String title;

    private String year;
    private String runtime;
    private String genre;
    private String poster;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
        
    }
    
    public String getRuntime() {
        return runtime;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getPoster() {
        return poster;
    }

	@Override
	public String toString() {
		return "FilmData [title=" + title + ", year=" + year + ", runtime=" + runtime + ", genre=" + genre + ", poster="
				+ poster + "]";
	}
    
    
    
        
}
