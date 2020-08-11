package api.review.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/")
    public String getReview() {
        return "review Information";
    }
}
