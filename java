package com.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlShortenerApplication {

        public static void main(String[] args) {
                    SpringApplication.run(UrlShortenerApplication.class, args);
        }

}

        }
}
package com.urlshortener.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UrlController {

    private Map<String,String> urlMap = new HashMap<>();

        @PostMapping("/shorten")
            public String shortenUrl(@RequestParam String url){

                    String shortCode = UUID.randomUUID().toString().substring(0,6);
                            urlMap.put(shortCode,url);

                                    return "http://localhost:8080/" + shortCode;
                                        }

                                            @GetMapping("/{code}")
                                                public String redirect(@PathVariable String code){

                                                        return urlMap.get(code);
                                                            }
                                                            }
                                                            