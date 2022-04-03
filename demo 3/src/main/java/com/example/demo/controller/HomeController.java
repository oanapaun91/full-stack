package com.example.demo.controller;

import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.json.*;

@RestController
public class HomeController {
    String op;

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public LocalTime time(String timeZone){
        LocalTime time = java.time.LocalTime.now(ZoneId.of(timeZone));
        return time;
    }

    @RequestMapping(value = "/harry-potter", method = RequestMethod.GET)
    public String harryPotter(){
        Faker faker = new Faker();
        String name = faker.name().fullName();
        return name;
    }

    @PostMapping(value = "/math-service")
    public String mathService(@RequestBody String jsonString) {
        JSONObject obj = new JSONObject(jsonString);
        Map<String,Integer> result = new HashMap<>();
        int v1 = (int) obj.getNumber("firstNumber");
        int v2 = (int) obj.getNumber("secondNumber");
        this.op = obj.getString("operation");
        int total = 1;
        switch(op){
            case "SUM":
                total = v1+v2;
                break;
            case "DIFFERENCE":
                total = v1-v2;
                break;
            case "POWER":
                while (v2 != 0) {
                    total *= v1;
                    v2--;
                }
                break;
            case "DIVIDE":
                total = v1 / v2;
                break;
            case "MULTIPLY":
                total = v1 * v2;
                break;
        }
        result.put("result", total);
        return new JSONObject(result).toString();
    }
}
