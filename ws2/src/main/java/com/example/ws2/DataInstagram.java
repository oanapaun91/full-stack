package com.example.ws2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataInstagram {
    String incoming_status;
    String outgoing_status;
    Boolean target_user_is_private;
}
