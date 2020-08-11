package api.advertising.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaAdvertisingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaAdvertisingApiApplication.class, args);
    }

}
