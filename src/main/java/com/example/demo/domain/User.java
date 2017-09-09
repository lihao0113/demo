package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lihao on 2017/9/9.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username; //用户名

    private String password; //密码

    private String fullName; //全名

    private String phone; //手机号

    private String email; //邮箱

    public User() {}
}
