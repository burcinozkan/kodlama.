package com.company.business.concrets;

import com.company.business.abstracts.UserService;
import com.company.core.LoggerService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entites.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {

        this.userDao=userDao;
    }

    @Override
    public void uyeOl(User user) {
        Pattern pattern= Pattern.compile("@gmail.com",Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(user.getEmail());
        boolean matchFound= matcher.find();
        if (!matchFound){
            System.out.println("Lütfen Geçerli bir mail adresi giriniz.");
        }else if((user.getName().length()<2) || (user.getSurname().length()<2)){
            System.out.println("Ad soyad en az 2 karakter olmalı!");
        }else if (user.getEmail().equals("1")){
            System.out.println("Bu mail adresi ile daha önce kayıt olunmuştur!Lütfen giriş yapınız");
        }else {
            userDao.uyeOl(user);
        }

    }


}
