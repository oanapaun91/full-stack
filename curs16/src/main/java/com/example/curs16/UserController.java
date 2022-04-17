package com.example.curs16;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


@RestController
public class UserController {
    ArrayList<User> listUsers = new ArrayList<>();
    ArrayList<User> loggedList = new ArrayList<>();


    @PostMapping("/register")
    public ResponseEntity<ArrayList<User>> handleRegister(@Valid @RequestBody User user) {
        for (User i : listUsers){
            if (i.getEmail().equals(user.getEmail())){
                return new ResponseEntity("Userul exista", HttpStatus.BAD_REQUEST);
            }
        }
        listUsers.add((user));
        return new ResponseEntity(listUsers, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> handleLogin(@Valid @RequestBody UserLogin user) {
        HashMap<String, String> list = new HashMap<>();

        for (User j: loggedList) {
            if (j.getEmail().equals(user.getEmail()) && j.getPassword().equals(user.getPassword())) {
                return new ResponseEntity(user, HttpStatus.ACCEPTED);
            }
        }
        for (User i : listUsers) {
            if (i.getEmail().equals(user.getEmail()) && i.getPassword().equals(user.getPassword())) {
                list.put("firstName", i.getFirstName());
                list.put("lastName", i.getLastName());
                list.put("email", i.getEmail());
                loggedList.add(i);
                return new ResponseEntity(new JSONObject(list).toString(), HttpStatus.OK);
            }
        }
        return new ResponseEntity("Nu exista cont", HttpStatus.BAD_REQUEST);
    }

//    @RequestMapping(value = "/logout/{email}", method = RequestMethod.GET)
//    public ResponseEntity<ArrayList<User>> handleLogout(@Valid @PathVariable String email) {
//        for (User j: loggedList) {
//            if (j.getEmail().equals(email)) {
//                loggedList.remove(j);
//                return new ResponseEntity(loggedList, HttpStatus.ACCEPTED);
//            }
//        }
//        return new ResponseEntity(loggedList, HttpStatus.NOT_FOUND);
//    }
}
