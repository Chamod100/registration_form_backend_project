package org.example.controoler;

import org.example.Model.Entity.UserData;
import org.example.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api")
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @PostMapping("/saveData")
    @CrossOrigin(origins = "http://http://127.0.0.1:5500/")
    public UserData saveData(@RequestBody UserData userData) {
        return userDataService.saveUserData(userData);
    }
}
