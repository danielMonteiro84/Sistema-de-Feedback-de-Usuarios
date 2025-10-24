package br.com.danielmonteiro.feedbacksistem.modules.user.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.danielmonteiro.feedbacksistem.modules.user.UserEntity;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public void create(@RequestBody UserEntity userEntity) {
        System.out.println("Usuario");
        System.out.println(userEntity.getEmail());
    }
}
