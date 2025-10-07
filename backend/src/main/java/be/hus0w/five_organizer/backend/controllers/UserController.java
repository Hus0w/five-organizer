package be.hus0w.five_organizer.backend.controllers;

import be.hus0w.five_organizer.backend.models.User;
import be.hus0w.five_organizer.backend.services.UserServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceDB userServiceDB;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userServiceDB.addUser(user);
    }
}
