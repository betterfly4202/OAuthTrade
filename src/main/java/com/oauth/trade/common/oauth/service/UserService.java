package com.oauth.trade.common.oauth.service;

/**
 * Created by betterFLY on 2017-11-22.
 */
import com.oauth.trade.common.oauth.Repository.UserRepository;
import com.oauth.trade.common.oauth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public void save(User user){
        user.setPassword(getPasswordEncoder().encode(user.getPassword()));
        repo.save(user);
    }

}