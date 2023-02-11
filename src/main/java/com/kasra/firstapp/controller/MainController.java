package com.kasra.firstapp.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "/path/{username}/{password}", method = RequestMethod.POST)
    public String pathToString(@PathVariable("username") String username,@PathVariable("password") String password){
        return username + ',' + password;
    }
    @RequestMapping(value = "/param", method = RequestMethod.POST)
    public String param(@RequestParam("username") String username){
        return username ;
    }

    @RequestMapping(value = "/body", method = RequestMethod.POST)
    public String body(@RequestBody User body)
    {
        return body.getUsername() + " , "+ body.getPassword() ;
    }

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public String json()
    {
        List<User> users = new ArrayList<>();
       User user = new User("kasrafarokhinia","kasrafarokhinia@gmail.com");
       User user1 = new User("mohammad","testtest1");
       users.add(user);
       users.add(user1);
       return new Gson().toJson(users);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String changeToString() {
        return "change to string called";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Integer changeToNumebr() {
        return 125654;
    }
    @GetMapping(value = "/get")
    public String getString(){
        return "get string called";
    }
    @PostMapping(value = "/post")
    public String postString()
    {
        return "test";
    }
}
