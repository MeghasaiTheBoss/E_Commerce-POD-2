package com.pod2.Ecommerce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod2.Ecommerce.Entities.User;
import com.pod2.Ecommerce.Repositories.userRepository;
@Service
public class userService 
{
    @Autowired userRepository usr_rep;

    public void addUser(User use){
         usr_rep.save(use);
    }
    public Iterable<User> getAll(){
        return usr_rep.findAll();
    }
}
