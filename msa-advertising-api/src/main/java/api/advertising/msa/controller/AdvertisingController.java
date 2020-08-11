package api.advertising.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertisingController {

    @GetMapping("/")
    public String getAdvertising() {
        return "advertising Information";
    }
}
