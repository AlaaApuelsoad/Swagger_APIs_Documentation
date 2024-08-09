package com.apiDocumentation.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TweetController {

    private TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PostMapping("/add")
    public void addTweet() {
        tweetService.addTweet();
    }

    @GetMapping("/view")
    public List<Tweet> viewTweets() {
        return tweetService.getTweets();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
