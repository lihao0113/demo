package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihao on 2017/9/9.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * 返回所有用户
     * @return
     */
    public List<User> findAll(){
        List<User> list = userRepository.findAll();
        return list;
    }


}
