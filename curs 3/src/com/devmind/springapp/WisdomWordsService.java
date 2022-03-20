package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class WisdomWordsService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
