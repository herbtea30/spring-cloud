package api.review.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaReviewApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaReviewApiApplication.class, args);
    }

}
