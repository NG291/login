package com.vip.service;

import com.vip.model.Login;
import com.vip.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
   private static List<User> users;
   static{
       users= new ArrayList<>();
       users.add(new User("admin","admin123","admin","admin@localhost",30));
       users.add(new User("user","user123","user","user@localhost",25));
       users.add(new User("guest","guest123","guest","guest@localhost",20));
   }
   public static User checkLogin(Login login){
       for(User user : users){
           if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
               return user;
           }
       }
       return null;
   }
}
