package api.review.msa.controller;

import api.review.msa.component.MessageProducer.WriteReviewSource;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private WriteReviewSource writeReviewSource;

    public ReviewController(WriteReviewSource writeReviewSource) {
        this.writeReviewSource = writeReviewSource;
    }

    @GetMapping("/")
    public String getReview() {
        return "review Information";
    }

    @PostMapping("/")
    public String setReview() {
        writeReviewSource.writeReview().send(MessageBuilder.withPayload("{seq : 13322}").build());
        return "write review";
    }
}
