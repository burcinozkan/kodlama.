package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entites.concretes.User;

public class GoogleUserDao implements UserDao{
    @Override
    public void uyeOl(User user) {
        System.out.println(user.getEmail()+ "adresine onay maili gönderildi!");
    }

}
