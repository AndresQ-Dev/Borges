import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class BookService {
    private final RestTemplate restTemplate;

    public BookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String searchBooks(String query) {
        String url = "http://openlibrary.org/search.json?q=" + query;
        return restTemplate.getForObject(url, String.class);
    }
}
