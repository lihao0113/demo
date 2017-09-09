package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lihao on 2017/9/9.
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
