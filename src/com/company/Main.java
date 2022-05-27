package com.company;


import com.company.business.abstracts.UserService;
import com.company.business.concrets.UserManager;

import com.company.dataAccess.concretes.GoogleUserDao;
import com.company.entites.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService= new UserManager(new GoogleUserDao());
        User user= new User("burcin","özkna",123,"burcınozkkan12@gmail.com");
        userService.uyeOl(user);
    }
}
