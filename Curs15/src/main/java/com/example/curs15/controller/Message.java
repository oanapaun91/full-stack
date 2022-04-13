package com.example.curs15.controller;

import lombok.Data;

@Data
public class Message {
    String sender;
    String receiver;
    String text;
    Boolean seen;
    String sentDate;
}
