package com.example.ws2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersRelationship {
    DataInstagram dataInstagram;
    Metadata metadata;
}
