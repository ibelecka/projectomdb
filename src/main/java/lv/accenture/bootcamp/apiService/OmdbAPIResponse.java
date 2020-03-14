package lv.accenture.bootcamp.apiService;


public class OmdbAPIResponse {

    private String status;

    private FilmData results;

    public FilmData getResults() {
        return results;
    }

	@Override
	public String toString() {
		return "OmdbAPIResponse [status=" + status + ", results=" + results + "]";
	}
    
    
}
