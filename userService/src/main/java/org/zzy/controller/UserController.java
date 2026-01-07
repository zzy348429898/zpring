package org.zzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.zzy.Entity.User;
import org.zzy.Repository.UserRepository;
import org.zzy.common.api.CommonPage;
import org.zzy.common.api.Result;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("createUser")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllUsers() {
        userRepository.deleteAll();
        return "All users deleted.";
    }

    @GetMapping
    public Result<CommonPage<User>> getAllUsers(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNum - 1, pageSize);
        Page<User> userPage = userRepository.findAll(pageRequest);
        return Result.success(CommonPage.restPage(userPage));
    }
}
