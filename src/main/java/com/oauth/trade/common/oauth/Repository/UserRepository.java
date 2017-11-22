package com.oauth.trade.common.oauth.Repository;


import com.oauth.trade.common.oauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by betterFLY on 2017-11-22.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}