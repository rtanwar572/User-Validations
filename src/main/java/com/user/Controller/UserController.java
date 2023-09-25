package com.user.Controller;

import com.user.Model.User;
import com.user.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //get User by id
    @GetMapping("user/id/{id}")
    public List<User> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    //adding one User
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }
    //updating details like uname
    @PutMapping("user/id/{id}")
    public String updateUser(@PathVariable Integer id,@RequestParam String uname){
        return userService.updateUser(id,uname);
    }
    //getting all users ..
    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
//    adding all Users
    @PostMapping("users")
    public String addUsers(@Valid @RequestBody List<User> mylist) {
        return userService.addAllUser(mylist);

    }

    //Deleting user by id
    @DeleteMapping("user/id")
    public List<User> deleteUser(@RequestParam Integer id){
        return userService.deleteUser(id);
    }

}
