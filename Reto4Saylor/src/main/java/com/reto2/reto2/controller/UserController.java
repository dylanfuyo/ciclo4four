package com.reto2.reto2.controller;


import java.util.List;
import java.util.Optional;

import com.reto2.reto2.modelo.User;
import com.reto2.reto2.servicio.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Brayand Fuyo
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")

public class UserController {
    @Autowired
    private UserService userService;
    /**
    *endPoint Get
     */
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
    /**
     * enPonitGet+id
     */
    @GetMapping("/{id}")
    public Optional <User> getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }
    /**
     * endPoint Post
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    /**
     * 
     * @param user
     * @return
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    /**
     * 
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return userService.delete(id);
    }
    /**
     * 
     * @param email
     * @param password
     * @return
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }
    /**
     * 
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable("email") String email) {
        return userService.emailExists(email);
    }

    @GetMapping("/birthday/{birthday}")
    public List<User> getByMonthBirtday(@PathVariable("birthday") String birthDay){
        return userService.getByMonthBirthDay(birthDay);
    }
}
