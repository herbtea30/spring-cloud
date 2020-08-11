package api.news.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/")
    public String getNews() {
        return "news Information";
    }
}
