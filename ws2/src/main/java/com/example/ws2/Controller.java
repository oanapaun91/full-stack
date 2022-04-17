package com.example.ws2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
// Fear and Greed - get index
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public List<Object> fearAndGreed(@RequestParam(name = "limit") int limit) throws URISyntaxException, IOException {
//        String url = "https://api.alternative.me/fng/?limit=" + limit;
////        RestTemplate restTemplate = new RestTemplate();
////        Index[] indexes = restTemplate.getForObject(url, Index[].class);
////        return Arrays.asList(indexes);
//        URL jsonUrl = new URL(url);
//        ObjectMapper mapper = new ObjectMapper();
//        Index indexes = mapper.readValue(jsonUrl, Index.class);
//        return Arrays.asList(indexes);
//   }


//  Youtube
    @RequestMapping(value = "/relationship/{user_id}", method = RequestMethod.GET)
    public List<Object> usersRelation (@PathVariable String user_id) throws IOException {
        String url = "https://api.instagram.com/v1/users/43472159226/relationship";
        URL jsonURL = new URL(url);
        ObjectMapper mapper = new ObjectMapper();
        UsersRelationship items = mapper.readValue(jsonURL, UsersRelationship.class);
        return Arrays.asList(items);
    }

}
