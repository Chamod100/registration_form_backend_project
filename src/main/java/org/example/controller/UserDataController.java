package org.example.controller;

import org.example.Model.Entity.UserData;
import org.example.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserDataController {

    private final UserDataService userDataService;

    @Autowired
    public UserDataController(UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    @PostMapping("/saveData")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public UserData saveData(@RequestBody UserData userData) {
        return userDataService.saveUserData(userData);
    }
}