package org.example.service;

import org.example.Model.Entity.UserData;
import org.example.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    public UserData saveUserData(UserData userData) {
        return userDataRepository.save(userData);
    }

}
