package com.example.ws2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    int value;
    String value_classification;
    String timestamp;
    String time_until_update;
}
