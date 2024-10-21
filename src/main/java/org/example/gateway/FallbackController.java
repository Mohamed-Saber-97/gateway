package org.example.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @RequestMapping("/rate-limit-exceeded")
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public String rateLimitExceeded() {
        return "You have exceeded your request limit. Please try again later.";
    }
}
