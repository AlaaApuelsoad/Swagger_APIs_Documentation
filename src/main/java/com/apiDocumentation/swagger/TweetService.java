package com.apiDocumentation.swagger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TweetService {

    private List<Tweet> tweetList = new ArrayList<>();

    public void addTweet(){

        Tweet tweet1 = new Tweet();

        tweet1.setId(1);
        tweet1.setTitle("My first tweet");
        tweet1.setMessage("This is a dummy tweet for demonstration purposes.");
        tweetList.add(tweet1);

        Tweet tweet2 = new Tweet();
        tweet2.setId(2);
        tweet2.setTitle("My second tweet");
        tweet2.setMessage("This is the second dummy tweet for demonstration purposes.");
        tweetList.add(tweet2);
    }

    public List<Tweet> getTweets(){
        System.out.println(tweetList.size());
        return tweetList;
    }
}
