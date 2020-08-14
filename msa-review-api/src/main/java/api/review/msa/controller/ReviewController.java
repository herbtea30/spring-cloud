package api.review.msa.controller;

import api.review.msa.component.MessageProducer.WriteReviewSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ReviewController {

    @Autowired
    WriteReviewSource writeReviewSource;

    @RequestMapping("/")
    public String getReview() {

        return "review Information";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String setReview(@RequestHeader(value="Authorization") String authorization) {

        System.out.println("Authorization : "+authorization);
        // set new review
		//writeReviewSource.writeReview().send(MessageBuilder.withPayload("{seq : 13322}").build());

        WebClient client = WebClient.builder()
                .baseUrl("http://localhost:8090/api/news")
                .defaultHeader("Authorization", authorization)
                .build();

        Mono<String> response = client.get().uri("/review/add?newsId=333").retrieve().bodyToMono(String.class);
        System.out.println("Response : " + response.block());

        return "write review";
    }
}
