package com.kasra.firstapp.controller;

import org.springframework.web.bind.annotation.*;

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
    public String body(@RequestBody String username){
        return username ;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String changeToString() {
        return "kasraaaaaaaaaaaaa";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Integer changeToNumebr() {
        return 125654;
    }
    @GetMapping(value = "/get")
    public String getString(){
        return "omad";
    }
    @PostMapping(value = "/post")
    public String postString()
    {
        return "testttttttt";
    }
}
